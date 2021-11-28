package fuswx.service.impl;

import com.github.pagehelper.PageHelper;
import fuswx.dao.IUserDao;
import fuswx.domain.User;
import fuswx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return userDao.findAll();
    }

    @Override
    public void register(User user) {
        userDao.register(user);
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void alter(User user) {
        userDao.alter(user);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }

    @Override
    public List<User> findByAny(Integer pageNum,Integer pageSize,String data) {
        PageHelper.startPage(pageNum,pageSize);
        return userDao.findByAny("%"+data+"%");
    }
}
