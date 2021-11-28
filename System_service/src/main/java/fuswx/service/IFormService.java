package fuswx.service;

import fuswx.domain.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface IFormService {

    void delete(Integer formId);

    void submit(String pageTitle, String totalTitle, String totalText,String submitType,String formId);

    ArrayList<NewTable> findAll(Integer pageNum, Integer pageSize);

    AddIput_Total writeAll(Integer formId,String type);

    void formSubmit(String totalName, String totalText, String submitType,String formId);

    ArrayList<String> findFormTitles(Integer formId);

    List<FormDetail> formDetail(Integer formId,Integer pageNum, Integer pageSize);

    String  findFormName(Integer formId);

    void formDelete(String formName, Integer formId);

    ArrayList<FormDetail> findByAny(String formName, String data,Integer pageNum,Integer pageSize);

    Integer findByAnyCount(String formName, String data);

    ArrayList<NewTable> findNewTableByAny(Integer pageNum,Integer pageSize,String data);

    RequestText writeOneRequest(String formName, Integer formId,Integer newtableId);

    Integer toRegistrant();

    void toUseForm(Integer formId);

    Integer findDetailTextIdCount(Integer formId);

    HashMap<String, ArrayList<String>> findPeopleNum(Integer formId);
}
