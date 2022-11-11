package com.example.exceptiontest.controller;

import com.example.exceptiontest.exception.IntenalException;
import com.example.exceptiontest.exception.ResourceNotFoundException;
import com.example.exceptiontest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

//    @GetMapping("/user/{id}")
//    public String test(@PathVariable("id") String id){
//        return id;
//    }
//
//    @PostMapping("/storeData")
//    public Entity uuu(@RequestBody Entity entity){
//        return entity;
//    }



    @GetMapping("/getUser/{id}")
    public String getUser(@PathVariable("id")Integer id) throws Exception {
        if(id==1){
            throw new ResourceNotFoundException("Resource not found There");
        }

        if(id == 2){
            throw new IntenalException("This is a global Exception ");
        }

        if(id == 3){
            throw new Exception("Exception for all");
        }

        if(id == 4){
           int val = 8/0;
        }
        if(id==5){
            int arr []={1,2,3};
            int k = arr[4];
        }

        String  val = null;
        return val;
    }

    @GetMapping("/test/{str}")
    public String test(@PathVariable("str")String str) throws IntenalException {
        userService.test(str);
        return "welcome";
    }



}
