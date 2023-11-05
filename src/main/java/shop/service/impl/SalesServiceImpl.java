package shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import shop.dao.SalesDao;
import shop.domain.Sales;
import shop.service.SalesService;

import java.util.List;
@Component
public class SalesServiceImpl implements SalesService {
    @Autowired
    private SalesDao salesDao;
    @Override
    public List<Sales> selectAll() {
        return salesDao.selectAll();
    }
}
