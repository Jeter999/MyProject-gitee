package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userservice;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        List<User> list = new ArrayList<>();
        list=userservice.findAll();
        System.out.println("dddd");
        System.out.println("zzzzz");
        System.out.println("jjj");
        System.out.println("2222");
        System.out.println("2222");
        return list;
    }
}

