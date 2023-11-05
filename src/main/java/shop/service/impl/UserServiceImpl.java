package shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import shop.dao.UserDao;
import shop.domain.User;
import shop.service.UserService;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int insertuser(String username, String password) {
        return userDao.insertuser(username,password);
    }

    @Override
    public List<User> selectUser(String username, String password) {
        return userDao.selectUser(username,password);
    }

    @Override
    public List<User> selectisuser(String username) {
        return userDao.selectisuser(username);
    }
}
