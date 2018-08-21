package cn.itcast.service;

import cn.itcast.pojo.User;

import java.util.List;

public interface UserService {
    User getUserById(int id);
    List<User> getUserList();
    void updateUser(User user);
}
