package com.example.demo.mapper;

import com.example.demo.dto.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 根据用户名删除用户
     * @param userName
     * @return
     */
    @Select("select * from user where userName=#{userName}")
    User getUser(String userName);

    /**
     * 添加用户
     * @param userName
     * @param passWord
     */
    @Insert("insert into user (userName,passWord) values (#{userName},#{passWord})")
    void addUser(String userName,String passWord);

    /**
     * 删除用户
     * @param userName
     */
    @Delete("delete from user where userName=#{userName}")
    void delUser(String userName);

    /**
     * 修改用户
     * @param userName
     * @param passWord
     */
    @Update("update user set passWord = #{passWord} where userName = #{userName}")
    void updateUser(String userName,String passWord);
}