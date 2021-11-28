package fuswx.dao;

import fuswx.domain.FormDetail;
import fuswx.domain.Forms;
import fuswx.domain.NewTable;
import org.apache.ibatis.annotations.*;
import org.springframework.security.core.parameters.P;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface IFormDao {

    @Insert("insert into ${tableName} (inputid,uuid,type,content) values(#{form.inputId},#{form.uuid},#{form.type},#{form.content})")
    void submit(@Param("tableName") String tableName, @Param("form")Forms form);

    @Update("create table ${tableName} (inputid int not null,uuid varchar(50) not null, type varchar(50) not null,content varchar(1000))")
    void createInputTable(@Param("tableName") String time);

    @Update("create table ${tableName} (id int not null primary key auto_increment,uuid varchar(80))")
    void createInitTable(@Param("tableName") String tableName);

    @Update("alter table ${formTable} add ${title} varchar(1000)")
    void initFormTable(@Param("formTable") String formTableName,@Param("title") String title);

    @Insert("insert into newtable (formTitle,titleTable,TextTable,formTable) values(#{pageTitle},#{tableTitleName},#{tableTextName},#{formTableName})")
    void addToNewTable(@Param("pageTitle") String pageTitle,@Param("tableTitleName") String tableTitleName,@Param("tableTextName") String tableTextName,@Param("formTableName") String formTableName);

    @Select("select * from newtable")
    ArrayList<NewTable> findAll();

    @Update("delete from newtable where id=#{formId}")
    void deleteNewTable(Integer formId);

    @Select("select ${tableName} from newtable where id=#{formId}")
    String findTable(@Param("formId") Integer formId, @Param("tableName") String tableName);

    @Select("select formtitle from newtable where id=#{formId}")
    String findTableTitle(Integer formId);

    @Update("drop table ${tableName}")
    void dropTable(@Param("tableName") String tableName);

    @Select("select * from ${titleTable}")
    ArrayList<Forms> findTitleInput(@Param("titleTable") String titleTable);

    @Select("select * from ${textTable} where uuid=#{uuid}")
    ArrayList<Forms> findTextInput(@Param("textTable")String textTable, @Param("uuid") String uuid);

    @Select("select content from input_create where id=#{inputId}")
    String selectTitleInput(int inputId);

    @Select("select content from input_create_add where id=#{inputId}")
    String selectTextInput(int inputId);

    @Select("select content from input_init_update where id=#{inputId}")
    String selectUpdateTitleInput(int inputId);

    @Select("select content from input_add_update where id=#{inputId}")
    String selectUpdateTextInput(int inputId);

    @Update("update ${formName} set ${title}=#{totalText} where id=#{id}")
    void addToForm(@Param("formName") String formName,@Param("id")Integer id,@Param("title")String title, @Param("totalText")String totalText);

    @Insert("insert into ${formName} (${title}) values(#{totalText})")
    void addToFormByFirst(@Param("formName") String formName,@Param("title")String title, @Param("totalText")String totalText);

    @Select("select max(id) from ${formName}")
    Integer findSubmitFormId(@Param("formName") String formName,@Param("title")String title, @Param("totalText")String totalText);

    @Select("select column_name from information_schema.columns where table_name=#{formName}")
    ArrayList<String> findDetailTitle(@Param("formName") String formName);

    @Select("select ${titleName} from ${formName}")
    ArrayList<Integer> findDetailTextId(@Param("formName")String formName,@Param("titleName")String titleName);

    @Select("select count(id) from ${formName}")
    Integer findDetailTextIdCount(@Param("formName")String formName);

    @Select("select ${titleName} from ${formName} where id=#{id}")
    String findDetailText(@Param("formName")String formName,@Param("id")Integer id,@Param("titleName")String titleName);

    @Select("select * from ${formName} where id=#{id}")
    List<String> findDetailText2(@Param("formName")String formName, @Param("id")Integer id);

    @Delete("delete from ${formName} where id=#{formId}")
    void formDelete(@Param("formName")String formName,@Param("formId")Integer formId);

    @Select("select * from newtable where id like #{data} or formtitle like #{data} or titletable like #{data} or texttable like #{data} or formtable like #{data} or createtime like #{data} or adminid like #{data} or eg like #{data}")
    ArrayList<NewTable> findNewTableByAny(@Param("data")String data);

    @Select("select id from ${formName} where ${columnName} like #{data}")
    ArrayList<Integer> findByAny(@Param("formName")String formName, @Param("columnName")String columnName,@Param("data")String data);

    @Select("select count(id) from ${formName} where ${columnName} like #{data}")
    Integer findByAnyCount(@Param("formName")String formName, @Param("columnName")String columnName,@Param("data")String data);

    @Select("select ${formTitle} from ${formName} where id=#{formId}")
    String selectOneRequest(@Param("formName")String formName, @Param("formId")Integer formId, @Param("formTitle")String formTitle);

    @Select("select formId from useforms where id=(select max(id) from useforms);")
    Integer toRegistrant();

    @Insert("insert into useforms (formId) values(#{formId});")
    void toUseForm(Integer formId);

    @Select("select id from ${formName} where uuid=#{uuId}")
    Integer formCheck(@Param("uuId") String uuId,@Param("formName") String formName);

    @Select("select ${whichOne} from ${formName}")
    ArrayList<String> findPeopleNum(@Param("formName") String formName,@Param("whichOne")String whichOne);
}
