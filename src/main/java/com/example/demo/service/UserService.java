package com.example.demo.service;

import com.example.demo.dto.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserMapper {

    @Override
    public User getUser(String userName) {
        return null;
    }

    @Override
    public void addUser(String userName, String passWord) {

    }

    @Override
    public void delUser(String userName) {

    }

    @Override
    public void updateUser(String userName, String passWord) {

    }
}
