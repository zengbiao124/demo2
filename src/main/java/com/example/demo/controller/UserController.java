package com.example.demo.controller;

import com.example.demo.dto.User;
import com.example.demo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/rest/getUser")
    public User getUser(String userName) {
        User user = userMapper.getUser(userName);
        return user;
    }

    @RequestMapping("/rest/addUser")
    public String addUser(String userName, String passWord) {
        //先查找
        User user = userMapper.getUser(userName);
        if (user != null) {
            //有该用户，不能添加
            return "the user has been registered,please register again";
        } else {
            userMapper.addUser(userName, passWord);
            return "the user " + userName + "  added";
        }
    }

    @RequestMapping("/rest/delUser")
    public String delUser(String userName) {
        //先查找
        User user = userMapper.getUser(userName);
        if (user != null) {
            //有该用户，可删除
            userMapper.delUser(userName);
            return "the user has been deleted";
        } else {
            return "no found";
        }

    }

    @RequestMapping("/rest/updateUser")
    public String updateUser(String userName, String passWord) {
        //先查找
        User user = userMapper.getUser(userName);

        if (user != null) {
            //有该用户，可以修改
            userMapper.updateUser(userName, passWord);
            return "update successfully";
        } else {
            return "update......no found";
        }
    }
}
