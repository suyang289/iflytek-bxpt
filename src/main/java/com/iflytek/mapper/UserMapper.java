package com.iflytek.mapper;

import com.iflytek.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//制图员

@Mapper
public interface UserMapper {

    User queryUser(User user);
    User queryTwo(User user);


    List<User> list();
}
