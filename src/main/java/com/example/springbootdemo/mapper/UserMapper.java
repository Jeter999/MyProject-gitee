package com.example.springbootdemo.mapper;

import com.example.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
}
