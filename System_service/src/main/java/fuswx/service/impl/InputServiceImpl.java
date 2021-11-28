package fuswx.service.impl;

import fuswx.dao.InputDao;
import fuswx.domain.Input;
import fuswx.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InputServiceImpl implements InputService {

    @Autowired
    private InputDao inputDao;

    @Override
    public Input showOne(Integer id) {
        return inputDao.showOne(id);
    }

    @Override
    public Input addOne(Integer id) {
        return inputDao.addOne(id);
    }

    @Override
    public Input initOne(Integer id) {
        return inputDao.initOne(id);
    }
}
