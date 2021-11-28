package fuswx.service;

import fuswx.domain.Admin;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface IAdminService {

    void register(Admin admin);

    List<Admin> findAll(Integer pageNum,Integer pageSize);

    Admin findById(Integer id);
}
