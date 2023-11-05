package shop.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import shop.domain.User;

import java.util.List;


public interface UserDao {

    @Insert("insert into user (username,password) values(#{arg0},#{arg1})")
    int insertuser(String username,String password);

    @Select("select * from user where username=#{arg0} and password=#{arg1}")
    List<User> selectUser(String username, String password);

    @Select("select * from user where username=#{arg0}")
    List<User> selectisuser(String username);

}
