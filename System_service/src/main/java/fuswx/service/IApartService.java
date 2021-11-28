package fuswx.service;

import fuswx.domain.Apart;

import java.util.List;

public interface IApartService {
    List<Apart> findAll(Integer pageNum,Integer pageSize);

    void insertOne(String apartName, String apartQQ);

    void delete(String apartId);

    void initId(String apartName, String rowName);
}
