package com.example.log.service.impl;

import com.example.log.dao.UserMapper;
import com.example.log.pojo.User;
import com.example.log.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findOne(String id) {

        return userMapper.selectByPrimaryKey(id);
    }
}
