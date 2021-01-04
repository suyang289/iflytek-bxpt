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
    public ResultUtil updatePassword(User user) {
        // ����id�ҳ�ԭ����
        User queryUser = userMapper.queryUser(user);
        // �ж�ǰ�����������Ƿ���ͬ
        // ��--> update
        // ��--> ����ǰ����ʾ
        return null;
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
