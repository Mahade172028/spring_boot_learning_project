package com.example.exceptiontest.service;

import org.springframework.stereotype.Component;

@Component
public class UserInterfaceImpl implements UserInterface{
    @Override
    public String workfun() {
        return "Hello There";
    }
}
