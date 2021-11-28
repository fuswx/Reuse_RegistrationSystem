package fuswx.service.impl;

import com.github.pagehelper.PageHelper;
import fuswx.dao.IApartDao;
import fuswx.domain.Apart;
import fuswx.service.IApartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ApartServiceImpl implements IApartService {
    @Autowired
    private IApartDao apartDao;

    @Override
    public List<Apart> findAll(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return apartDao.findAll();
    }

    @Override
    public void insertOne(String apartName, String apartQQ) {
        apartDao.insertOne(apartName,apartQQ);
    }

    @Override
    public void delete(String apartId) {
        apartDao.delete(apartId);
    }

    @Override
    public void initId(String apartName, String rowName) {
        apartDao.dropRow(apartName,rowName);
        apartDao.setRow(apartName,rowName);
    }
}
