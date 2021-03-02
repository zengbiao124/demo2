package com.example.demo.controller;

import com.example.demo.dto.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class UserControllerTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    void getUser() {
        userMapper.getUser("小曾");
    }

    @Test
    void addUser() {
        User user=new User("小曾","123456");
        User user1=new User("小胡","1234567");
        User user2=new User("小力","1234568");
        User user3=new User("小谷","1234569");
        userMapper.addUser(user.getUserName(),user.getPassWord());
        userMapper.addUser(user1.getUserName(),user1.getPassWord());
        userMapper.addUser(user2.getUserName(),user2.getPassWord());
        userMapper.addUser(user3.getUserName(),user3.getPassWord());
    }

    @Test
    void delUser() {
        userMapper.delUser("小胡");
    }

    @Test
    void updateUser() {
        userMapper.updateUser("小智","1234510");
    }
}