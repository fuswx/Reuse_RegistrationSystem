package fuswx.service;

import fuswx.domain.Input;

public interface InputService {

    Input showOne(Integer id);

    Input addOne(Integer id);

    Input initOne(Integer id);
}
