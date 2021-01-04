package com.iflytek.service;

import com.iflytek.pojo.User;
import com.iflytek.utils.ResultUtil;

import java.util.List;

public interface UserService {

    User queryUser(User user);


    ResultUtil updatePassword(User user);

    List<User> list();
}
