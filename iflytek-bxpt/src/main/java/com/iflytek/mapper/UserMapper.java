package com.iflytek.mapper;

import com.iflytek.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User queryUser(User user);


    List<User> list();
}
