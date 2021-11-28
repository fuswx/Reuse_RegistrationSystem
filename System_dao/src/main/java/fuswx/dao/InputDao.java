package fuswx.dao;

import fuswx.domain.Input;
import org.apache.ibatis.annotations.Select;

public interface InputDao {
    @Select("select * from input_show where id=#{id}")
    Input showOne(Integer id);

    @Select("select * from input_add_update where id=#{id}")
    Input addOne(Integer id);

    @Select("select * from input_init where id=#{id}")
    Input initOne(Integer id);
}
