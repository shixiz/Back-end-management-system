package shop.dao;

import org.apache.ibatis.annotations.Select;
import shop.domain.Sales;

import java.util.List;

public interface SalesDao {
    @Select("select * from sales")
    List<Sales> selectAll();
}
