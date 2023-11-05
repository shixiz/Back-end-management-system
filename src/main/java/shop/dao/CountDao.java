package shop.dao;

import org.apache.ibatis.annotations.Select;
import shop.domain.Count;

import java.util.List;

public interface CountDao {
    @Select("select * from count")
    List<Count> selectAll();
}
