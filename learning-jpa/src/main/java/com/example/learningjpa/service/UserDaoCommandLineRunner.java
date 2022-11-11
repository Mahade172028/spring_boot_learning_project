package com.example.learningjpa.service;

import com.example.learningjpa.entity.Users;
import com.example.learningjpa.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class UserDaoCommandLineRunner implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(UserDaoCommandLineRunner.class);

    @Autowired
    UserDaoService userDaoService;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
//     Users users = new Users("Mahade","Admin");
//     Users usersResponse = userRepository.save(users);
//     logger.info("user saved :"+ usersResponse.getId());
    }
}
