package shop.service;

import shop.domain.User;

import java.util.List;

public interface UserService {
    int insertuser(String username,String password);

    List<User> selectUser(String username,String password);

    List<User> selectisuser(String username);
}
