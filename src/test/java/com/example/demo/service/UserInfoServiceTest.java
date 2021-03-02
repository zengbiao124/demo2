package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserInfoServiceTest {
@Autowired
private UserInfoService userInfoService;
private Logger log= LoggerFactory.getLogger(UserInfoServiceTest.class);

    @Test
    void getUserDto() {
        UserDto userDto=new UserDto();
        userDto.setId("002");
        userDto.setUsername("小虎");
//        UserDto flag=userInfoService.getUserDto();
        System.out.println("------------------------------------------------");
        System.out.println("flag:"+userDto.getId()+userDto.getUsername());
    }
}