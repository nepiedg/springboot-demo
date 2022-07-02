package com.example.d2.service.Impl;

import com.example.d2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.d2.entity.User;
import com.example.d2.mapper.UserMapper;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        List<User> list = userMapper.getAll();
        return list;
    }

}