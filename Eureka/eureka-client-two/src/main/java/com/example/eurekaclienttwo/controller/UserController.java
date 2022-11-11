package com.example.eurekaclienttwo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hey")
    String test(){
        return "Hello,I am Eureka client two";
    }

    //MICROSERVICE INTERNAL COMMUNICATION THROUGH EUREKA WITH REGISTERED NAME
    @GetMapping("/call-ping")
    String callPing(){
        return restTemplate.getForObject("http://EUREKA-CLIENT/ping",String.class);
    }

}
