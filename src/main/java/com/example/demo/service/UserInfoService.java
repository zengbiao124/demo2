package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    private Logger log = LoggerFactory.getLogger(UserInfoService.class);

    public UserDto getUserDto() {
        UserDto userDto = new UserDto();
        userDto.setId("001");
        userDto.setUsername("曾彪");
        log.info("UserInfoService-getUserDto,出参，当前用户：{}", userDto.getUsername());
        return userDto;
    }
}
