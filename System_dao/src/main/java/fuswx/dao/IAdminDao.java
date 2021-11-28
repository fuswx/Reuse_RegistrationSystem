package fuswx.dao;

import fuswx.domain.Admin;
import fuswx.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

public interface IAdminDao {

    @Insert("insert into admins(name,adminname,password,phonenum,qqnum) values(#{name},#{adminName},#{password},#{phoneNum},#{qqNum}")
    void register(Admin admin);

    @Select("select * from admins")
    List<Admin> findAll();

    @Select("select * from admins where id=#{id}")
    Admin findById(Integer id);

    @Update("update admins set name=#{name},adminname=#{adminName},password=#{password},phoneNum=#{phoneNum},qqNum=#{qqNum} where id=#{id}")
    void update(Admin admin);

    @Update("update admins set name=#{name},adminname=#{adminName},password=#{password},phoneNum=#{phoneNum},qqNum=#{qqNum},status=#{status} where id=#{id}")
    void alter(Admin admin);
}
