package fuswx.dao;

import fuswx.domain.Apart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IApartDao {
    @Select("select * from apart")
    List<Apart> findAll();

    @Insert("insert into apart(apartName,apartQQ) values(#{apartName},#{apartQQ})")
    void insertOne(@Param("apartName") String apartName, @Param("apartQQ") String apartQQ);

    @Update("delete from apart where id=#{apartId}")
    void delete(String apartId);

    @Update("alter table ${apartName} drop column ${rowName}")
    void dropRow(@Param("apartName") String apartName,@Param("rowName") String rowName);

    @Update("alter table ${apartName} add ${rowName} int primary key auto_increment not null")
    void setRow(@Param("apartName")String apartName, @Param("rowName")String rowName);
}
