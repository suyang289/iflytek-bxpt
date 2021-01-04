package com.iflytek.service;

import com.iflytek.pojo.User;
import com.iflytek.utils.ResultUtil;

import java.util.List;
//用户服务

public interface UserService {

    User queryUser(User user);
    User queryTwo(User user);


    ResultUtil updatePassword(User user);

    List<User> list();


}
