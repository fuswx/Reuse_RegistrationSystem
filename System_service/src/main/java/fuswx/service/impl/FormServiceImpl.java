package fuswx.service.impl;

import com.github.pagehelper.PageHelper;
import fuswx.dao.IFormDao;
import fuswx.domain.*;
import fuswx.service.IFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
@Transactional
public class FormServiceImpl implements IFormService {

    @Autowired
    private IFormDao formDao;

    @Override
    public void delete(Integer formId) {
        String titleTable=formDao.findTable(formId,"titleTable");
        String textTable=formDao.findTable(formId,"textTable");
        String formTable=formDao.findTable(formId,"formTable");
        formDao.deleteNewTable(formId);
        formDao.dropTable(textTable);
        formDao.dropTable(titleTable);
        formDao.dropTable(formTable);
    }

    @Override
    public void submit(String pageTitle, String totalTitle, String totalText,String submitType,String formId) {
        String[] totalTitles=totalTitle.split("·");
        String[] totalTexts=totalText.split("·");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy_MM_dd__HH_mm_ss");
        String time=simpleDateFormat.format(new Date()),textTableName="text_"+time,titleTableName="title_"+time,formTableName="form_"+time;
        Forms form;
        formDao.createInputTable(textTableName);
        formDao.createInputTable(titleTableName);
        formDao.createInitTable(formTableName);
        ArrayList<String> titles=new ArrayList<>();
        //分割处理（题与题之间）
        for (String title :totalTitles) {
            String[] totalTitleOne=title.split("~");
            form=new Forms(Integer.parseInt(totalTitleOne[0]),totalTitleOne[1],totalTitleOne[3],totalTitleOne[2]);
            formDao.submit(titleTableName,form);
            titles.add(totalTitleOne[1]);
        }
        //分割处理（题中）
        for (String text :totalTexts) {
            String[] totalTextOne=text.split("~");
            form=new Forms(Integer.parseInt(totalTextOne[0]),totalTextOne[2],totalTextOne[1],"text");
            formDao.submit(textTableName,form);
        }
        //初始化接收表单信息
        for (String title : titles) {
            //防止存储异常(数字、.开头)
            title=titleTransTools(title);
            formDao.initFormTable(formTableName,title);
        }
        formDao.addToNewTable(pageTitle,titleTableName,textTableName,formTableName);
        if (submitType.equals("update")){
            delete(Integer.parseInt(formId));
        }
    }

    @Override
    public ArrayList<NewTable> findAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return formDao.findAll();
    }

    @Override
    public AddIput_Total writeAll(Integer formId,String type) {
        ArrayList<AddInput> addInputs=new ArrayList<>();
        String pageTitle=formDao.findTableTitle(formId);
        String titleTable=formDao.findTable(formId,"titleTable");
        String textTable=formDao.findTable(formId,"textTable");
        ArrayList<Forms> titleInputs=formDao.findTitleInput(titleTable);
        for (Forms titleInput:titleInputs) {
            ArrayList<Forms> textInputs=new ArrayList<>();
            textInputs=formDao.findTextInput(textTable,titleInput.getUuid());
            StringBuilder content= new StringBuilder();
            if (type.equals("writeAll")){
                content.append(formDao.selectTitleInput(titleInput.getInputId()));
            }else {
                content.append(formDao.selectUpdateTitleInput(titleInput.getInputId()));
            }
            String titleContent=titleInput.getContent();
            ArrayList<String> textContents=new ArrayList<>();
            for (Forms textInput:textInputs) {
                if (type.equals("writeAll")){
                    content.append(formDao.selectTextInput(textInput.getInputId()));
                }else if (type.equals("update")){
                    content.append(formDao.selectUpdateTextInput(textInput.getInputId()));
                }
                textContents.add(textInput.getContent());
            }
            if (titleInput.getInputId()==3){
                content.append("</select>\n</div>\n</div>");
            }else {
                content.append("</div>\n</div>\n");
            }
            AddInput addInput=new AddInput(content.toString(),titleContent,textContents,titleInput.getInputId());
            addInputs.add(addInput);
        }
        return new AddIput_Total(pageTitle,addInputs);
    }

    @Override
    public void formSubmit(String totalName, String totalText, String submitType,String formName) {
        String[] totalNames=totalName.split("·");
        String[] totalTexts=totalText.split("·");
        HashMap<String,String> binds=new HashMap<>();
        for (int i = 0; i < totalNames.length; i++) {
            String title=totalNames[i].split("~")[0];
            title=titleTransTools(title);
            String smallTitle=totalNames[i].split("~")[1];
            if (smallTitle.toCharArray().length==1&&((int)(smallTitle.toCharArray()[0])>=48&&(int)(smallTitle.toCharArray()[0])<=57)){
                if (binds.containsKey(title)){
                    binds.put(title,binds.get(title)+"~"+totalTexts[i]);
                }else {
                    binds.put(title,totalTexts[i]);
                }
            }else {
                if (binds.containsKey(title)){
                    binds.put(title,binds.get(title)+"·"+smallTitle+"~"+totalTexts[i]);
                }else {
                    binds.put(title,smallTitle+"~"+totalTexts[i]);
                }
            }
        }
        Set<String> titles=binds.keySet();
        int index=0;
        Integer id = null;
        for (String title:titles) {
            if (index==0){
                formDao.addToFormByFirst(formName,title,binds.get(title));
                index++;
                id=formDao.findSubmitFormId(formName,title,binds.get(title));
            }else {
                formDao.addToForm(formName,id,title,binds.get(title));
            }
        }

        if (formDao.formCheck(binds.get("uuId"),formName)==null){
            formSubmit(totalName,totalText,submitType,formName);
        }
    }

    @Override
    public String findFormName(Integer formId) {
        return formDao.findTable(formId,"formtable");
    }
    @Override
    public ArrayList<String> findFormTitles(Integer formId){
        String formName=formDao.findTable(formId,"formtable");
        return formDao.findDetailTitle(formName);
    }

    @Override
    public Integer findDetailTextIdCount(Integer formId){
        return formDao.findDetailTextIdCount(formDao.findTable(formId,"formtable"));
    }

    @Override
    public HashMap<String, ArrayList<String>> findPeopleNum(Integer formId) {
        HashMap<String, ArrayList<String>> apart=new HashMap<>();
        String str1="第一志愿部门",str2="第二志愿部门";
        apart.put(str1,formDao.findPeopleNum(findFormName(formId),str1));
        apart.put(str2,formDao.findPeopleNum(findFormName(formId),str2));
        return apart;
    }


    @Override
    public ArrayList<FormDetail> formDetail(Integer formId,Integer pageNum,Integer pageSize) {
        String formName=formDao.findTable(formId,"formtable");
        ArrayList<String> formTitles=findFormTitles(formId);
        ArrayList<FormDetail> formDetails=new ArrayList<>();
        ArrayList<Integer> ids;
        if (pageSize!=-1){
            PageHelper.startPage(pageNum,pageSize);
            ids=formDao.findDetailTextId(formName,"id");
        }else {
            ids=formDao.findDetailTextId(formName,"id");
        }
        for (int id:ids) {
            LinkedHashMap<String,String> formTexts=new LinkedHashMap<>();
            FormDetail formDetail=new FormDetail();
            formTexts.put("id",id+"");
            for (String formTitle:formTitles) {
                if (!formTitle.toLowerCase(Locale.ROOT).equals("uuid")){
                    formTexts.put(formTitle, formDao.findDetailText(formName, id, formTitle));
                }
            }
            formDetail.setTotalTexts(formTexts);
            formDetails.add(formDetail);
        }
        return formDetails;
    }
    @Override
    public ArrayList<NewTable> findNewTableByAny(Integer pageNum,Integer pageSize,String data) {
        PageHelper.startPage(pageNum,pageSize);
        return formDao.findNewTableByAny("%"+data+"%");
    }

    @Override
    public ArrayList<FormDetail> findByAny(String formName,String data,Integer pageNum,Integer pageSize) {
        ArrayList<String> formTitles=formDao.findDetailTitle(formName);
        ArrayList<FormDetail> formDetails=new ArrayList<>();
        ArrayList<Integer> ids;
        if (pageSize!=-1){
            PageHelper.startPage(pageNum,pageSize);
            ids=formDao.findByAny(formName,data.split(":")[0],"%"+data.split(":")[1]+"%");
        }else {
            ids=formDao.findByAny(formName,data.split(":")[0],"%"+data.split(":")[1]+"%");
        }
        for (int id:ids) {
            LinkedHashMap<String,String> formTexts=new LinkedHashMap<>();
            FormDetail formDetail=new FormDetail();
            formTexts.put("id",id+"");
            for (String formTitle:formTitles) {
                formTexts.put(formTitle,formDao.findDetailText(formName,id,formTitle));
            }
            formDetail.setTotalTexts(formTexts);
            formDetails.add(formDetail);
        }
        return formDetails;
    }

    @Override
    public Integer findByAnyCount(String formName, String data) {
        return formDao.findByAnyCount(formName,data.split(":")[0],"%"+data.split(":")[1]+"%");
    }


    @Override
    public void formDelete(String formName, Integer formId) {
        formDao.formDelete(formName,formId);
    }

    @Override
    public RequestText writeOneRequest(String formName, Integer formId,Integer newTableId) {
        RequestText requestTexts=new RequestText();
        ArrayList<Forms> forms=formDao.findTitleInput(formDao.findTable(newTableId,"titletable"));
        HashMap<String,String> oneRequestText1=new HashMap<>();
        HashMap<String,HashMap<String,String>> mon=new HashMap<>();
        for (Forms form : forms) {
            String title=titleTransTools(form.getContent());
            String requestText=formDao.selectOneRequest(formName,formId,title);
            System.out.println("requestText======"+requestText);
            if (requestText!=null&&(requestText.split("·").length>1||requestText.split("~").length>1)){
                HashMap<String,String> oneRequest=new HashMap<>();
                String[] totalOneRequest=requestText.split("·");
                for (String oneRequests : totalOneRequest) {
                    String oneRequestTitle=oneRequests.split("~")[0];
                    String oneRequestText2=oneRequests.split("~")[1];
                    oneRequest.put(oneRequestTitle,oneRequestText2);
                }
                mon.put(form.getContent(),oneRequest);
            }else {
                oneRequestText1.put(form.getContent(),requestText);
            }
        }
        requestTexts.setMulRequest(mon);
        requestTexts.setOneRequest(oneRequestText1);
        return requestTexts;
    }

    @Override
    public Integer toRegistrant() {
        return formDao.toRegistrant();
    }

    @Override
    public void toUseForm(Integer formId) {
        formDao.toUseForm(formId);
    }

    public String titleTransTools(String title){
        char[] chars=title.toCharArray();
        title="";
        for (char ch : chars) {
            if (((int) ch <=64)||((int) ch >=91&& (int) ch <=96)||((int) ch >=123&& (int) ch <=127)){
                if ((int)ch >=48&&(int)ch<=57){
                    switch ((int)ch){
                        case 48:title+="Zero";break;
                        case 49:title+="One";break;
                        case 50:title+="Two";break;
                        case 51:title+="Three";break;
                        case 52:title+="Four";break;
                        case 53:title+="Five";break;
                        case 54:title+="Six";break;
                        case 55:title+="Seven";break;
                        case 56:title+="Eight";break;
                        case 57:title+="Nine";break;
                    }
                }
            }else {
                title+=ch;
            }
        }
        return title;
    }

    public String titleTransTools2(String title){
        char[] chars=title.toCharArray();
        title="";
        for (char ch : chars) {
            if (((int) ch <=64)||((int) ch >=91&& (int) ch <=96)||((int) ch >=123&& (int) ch <=127)){
            }else {
                title+=ch;
            }
        }
        return title;
    }

}