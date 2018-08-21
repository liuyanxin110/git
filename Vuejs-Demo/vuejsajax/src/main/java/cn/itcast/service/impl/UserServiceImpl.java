package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(int id) {
        User user = userDao.getUserById(id);
        return user;
    }

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

}
