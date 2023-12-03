package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;
    /*cindy*/
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
