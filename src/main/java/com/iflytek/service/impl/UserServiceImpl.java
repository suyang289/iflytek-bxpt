package com.iflytek.service.impl;

import com.iflytek.mapper.UserMapper;
import com.iflytek.pojo.User;
import com.iflytek.service.UserService;
import com.iflytek.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User queryUser(User user) {
        return userMapper.queryUser(user);
    }

    @Override
    public User queryTwo(User user) {
        return userMapper.queryTwo(user);
    }

    @Override
    public ResultUtil updatePassword(User user) {
        // 根据id找出原密码
        User queryUser = userMapper.queryUser(user);
        // 判断前后两次密码是否相同
        // 是--> update
        // 否--> 返回前端提示
        return null;
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
