package fuswx.service;

import fuswx.domain.User;

import java.util.List;

public interface IUserService {

    List<User> findAll(Integer pageNum,Integer pageSize);

    void register(User user);

    User findById(Integer id);

    void update(User user);

    void alter(User user);

    void delete(Integer id);

    List<User> findByAny(Integer pageNum,Integer pageSize,String data);
}
