package fuswx.service.impl;

import com.github.pagehelper.PageHelper;
import fuswx.dao.IAdminDao;
import fuswx.domain.Admin;
import fuswx.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private IAdminDao adminDao;

    @Override
    public void register(Admin admin) {
        adminDao.register(admin);
    }

    @Override
    public List<Admin> findAll(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return adminDao.findAll();
    }

    @Override
    public Admin findById(Integer id) {
        return adminDao.findById(id);
    }
}
