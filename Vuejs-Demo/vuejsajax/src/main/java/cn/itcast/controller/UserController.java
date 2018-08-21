package cn.itcast.controller;

import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    public User getUserById(@PathVariable int id) {
        User user = userService.getUserById(id);
        return  user;
    }



    @RequestMapping("/user/list")
    public List<User> getUserList() {
        return userService.getUserList();
    }



    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public Map updateUser(@RequestBody User user) {
        userService.updateUser(user);
        Map result = new HashMap();
        result.put("result","OK");
        return result;
    }
}
