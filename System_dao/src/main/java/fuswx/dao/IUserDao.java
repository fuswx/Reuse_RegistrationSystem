package fuswx.dao;

import fuswx.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IUserDao {

    @Select("select * from users")
    List<User> findAll();

    @Insert("insert into users(name,username,password,phonenum,qqnum) values(#{name},#{userName},#{password},#{phoneNum},#{qqNum})")
    void register(User user);

    @Select("select * from users where id=#{id}")
    User findById(Integer id);

    @Update("update users set name=#{name},username=#{userName},password=#{password},phoneNum=#{phoneNum},qqNum=#{qqNum} where id=#{id}")
    void update(User user);

    @Update("update users set name=#{name},username=#{userName},password=#{password},phoneNum=#{phoneNum},qqNum=#{qqNum},status=#{status} where id=#{id}")
    void alter(User user);

    @Delete("delete from users where id=#{id}")
    void delete(Integer id);

    @Select("select * from users where name like #{data} or userName like #{data} or phoneNum like #{data} or qqNum like #{data}")
    List<User> findByAny(String data);
}
