package com.example.mongoautomation.controller;

import com.example.mongoautomation.entity.AgendaName;
import com.example.mongoautomation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/migrate")
    public void test(){
        userService.test();
    }

}
