package com.example.springsecurity.service;

import com.example.springsecurity.model.User;
import com.example.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserCreator implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        userRepository.saveAll(
                List.of(
                        new User("mahade","1234","USER",true),
                        new User("hasan","1234","ADMIN",true),
                        new User("emon","1234","ROOT",true)

        ));
    }
}
