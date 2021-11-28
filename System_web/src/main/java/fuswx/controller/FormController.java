package fuswx.controller;

import com.github.pagehelper.PageInfo;
import fuswx.domain.AddIput_Total;
import fuswx.domain.RequestText;
import fuswx.service.IFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping("/form")
public class FormController {

    @Autowired
    private IFormService formService;

    @RequestMapping("/submit.do")
    public String submit(@RequestParam(name = "pageTitle",required = true)String pageTitle, @RequestParam(required = true,name = "totalTitle")String totalTitle, @RequestParam(required = true,name = "totalText")String totalText,@RequestParam(required = true,name = "submitType")String submitType,@RequestParam(required = true,name = "formId")String formId){
        formService.submit(pageTitle,totalTitle,totalText,submitType,formId);
        return "form-submit-success";
    }
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "pageNum",required = true,defaultValue = "1")Integer pageNum,@RequestParam(name = "pageSize",required = true,defaultValue = "5")Integer pageSize){
        ModelAndView modelAndView=new ModelAndView();
        PageInfo pageInfo=new PageInfo(formService.findAll(pageNum,pageSize));
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.setViewName("form-list");
        return modelAndView;
    }
    @RequestMapping("/delete.do")
    public String delete(@RequestParam(name = "id",required = true)String id,@RequestParam(name = "pageNum",required = true,defaultValue = "1")Integer pageNum,@RequestParam(name = "pageSize",required = true,defaultValue = "5")Integer pageSize){
        formService.delete(Integer.parseInt(id));
        return "redirect:findAll.do?pageNum="+pageNum+"&pageSize="+pageSize;
    }

    @RequestMapping("/writeAll.do")
    public @ResponseBody AddIput_Total writeAll(Integer id){
        return formService.writeAll(id,"writeAll");
    }

    @RequestMapping("/selectOne.do")
    public ModelAndView selectOne(String formId){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("formName",formService.findFormName(Integer.parseInt(formId)));
        modelAndView.addObject("formId",formId);
        modelAndView.setViewName("user-registration");
        return modelAndView;
    }
    @RequestMapping("/update.do")
    public @ResponseBody AddIput_Total update(Integer id){
        return formService.writeAll(id,"update");
    }

    @RequestMapping("/findApartPeopleNum.do")
    public @ResponseBody HashMap<String, ArrayList<String>> findApartPeopleNum(Integer formId){
        return formService.findPeopleNum(formId);
    }

    @RequestMapping("/updateOne.do")
    public ModelAndView updateOne(String formId){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("formId",formId);
        modelAndView.setViewName("form-update");
        return modelAndView;
    }
    @RequestMapping("/formSubmit.do")
    public ModelAndView formSubmit(@RequestParam(name = "totalName") String totalName,@RequestParam(name = "totalText") String totalText,@RequestParam(name = "submitType") String submitType,@RequestParam(required = true,name = "formName")String formName){
        ModelAndView modelAndView=new ModelAndView();
        formService.formSubmit(totalName,totalText,submitType,formName);
        modelAndView.setViewName("submit-success");
        return modelAndView;
    }
    @RequestMapping("/formDetail.do")
    public ModelAndView formDetail(@RequestParam(name = "formId")Integer formId,@RequestParam(name = "pageNum",required = true,defaultValue = "1")Integer pageNum,@RequestParam(name = "pageSize",required = true,defaultValue = "5")Integer pageSize){
        ModelAndView modelAndView=new ModelAndView();
        PageInfo pageInfo=new PageInfo(formService.formDetail(formId,pageNum,pageSize));
        System.out.println("============"+pageInfo);
        Integer total=formService.findDetailTextIdCount(formId);
        pageInfo.setTotal(total);
        pageInfo.setPages(pageSize==-1?1:total%pageSize ==0?total/pageSize:total/pageSize+1);
        pageInfo.setPageNum(pageNum);
        pageInfo.setPageSize(pageSize);
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.addObject("formName",formService.findFormName(formId));
        modelAndView.addObject("formTitle",formService.findFormTitles(formId));
        modelAndView.addObject("formId",formId);
        modelAndView.setViewName("form-list-detail");
        return modelAndView;
    }
    @RequestMapping("/formDelete.do")
    public String formDelete(@RequestParam(name = "pageNum")Integer pageNum,@RequestParam(name = "pageSize")Integer pageSize,@RequestParam(name = "totalFormId")Integer totalFormId,@RequestParam(name = "formName")String formName,@RequestParam(name = "formId")Integer formId){
        formService.formDelete(formName,formId);
        return "redirect:formDetail.do?formId="+totalFormId+"&pageNum="+pageNum+"&pageSize="+pageSize;
    }

    @RequestMapping("/findByAny.do")
    public ModelAndView findByAny(Integer formId,String formName,String data,Integer pageNum,Integer pageSize){
        ModelAndView modelAndView=new ModelAndView();
        PageInfo pageInfo=new PageInfo(formService.findByAny(formName,data,pageNum,pageSize));
        Integer total=formService.findByAnyCount(formName,data);
        pageInfo.setTotal(total);
        pageInfo.setPages(pageSize==-1?1:total%pageSize ==0?total/pageSize:total/pageSize+1);
        pageInfo.setPageNum(pageNum);
        pageInfo.setPageSize(pageSize);
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.addObject("formName",formService.findFormName(formId));
        modelAndView.addObject("formTitle",formService.findFormTitles(formId));
        modelAndView.addObject("formId",formId);
        modelAndView.addObject("data",data);
        modelAndView.setViewName("form-list-detail-any");
        return modelAndView;
    }


    @RequestMapping("/findNewTableByAny.do")
    public ModelAndView findNewTableByAny(Integer pageNum,Integer pageSize,String data){
        ModelAndView modelAndView=new ModelAndView();
        PageInfo pageInfo=new PageInfo(formService.findNewTableByAny(pageNum,pageSize,data));
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.addObject("data",data);
        modelAndView.setViewName("form-list");
        return modelAndView;
    }

    @RequestMapping("/writeOneRequest.do")
    public ModelAndView writeOneRequest(String formName, Integer formId,Integer newTableId){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("newTableId",newTableId);
        modelAndView.addObject("formName",formName);
        modelAndView.addObject("formId",formId);
        modelAndView.setViewName("user-registration-detail");
        return modelAndView;
    }

    @RequestMapping(value = "/setMulRequestText.do",produces = "text/html;charset=UTF-8")
    public @ResponseBody String setMulRequestText(String formName, Integer formId,Integer newTableId,String title, String smallTitle){
        RequestText requestText=formService.writeOneRequest(formName,formId,newTableId);
        return requestText.getMulRequest().get(title).get(smallTitle);
    }
    @RequestMapping(value = "/setRequestText.do",produces = "text/html;charset=UTF-8")
    public @ResponseBody String setRequestText(String formName, Integer formId,Integer newTableId,String title){
        RequestText requestText=formService.writeOneRequest(formName,formId,newTableId);
        return requestText.getOneRequest().get(title);
    }

    @RequestMapping("/toRegistrant.do")
    public ModelAndView toRegistrant(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("formId",formService.toRegistrant());
        modelAndView.addObject("formName",formService.findFormName(formService.toRegistrant()));
        modelAndView.setViewName("user-registration");
        return modelAndView;
    }
    @RequestMapping("/toUseForm.do")
    public String toUseForm(Integer formId,Integer pageNum,Integer pageSize){
        formService.toUseForm(formId);
        return "redirect:findAll.do?pageNum="+pageNum+"&pageSize="+pageSize;
    }
}
