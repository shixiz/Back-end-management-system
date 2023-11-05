package shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import shop.dao.CountDao;
import shop.domain.Count;
import shop.service.CountService;

import java.util.List;

@Component
public class CountServiceImpl implements CountService {
    @Autowired
    private CountDao countDao;

    @Override
    public List<Count> selectAll() {
        return countDao.selectAll();
    }
}
