package com.example.eurekagateway.repository;


import com.example.eurekagateway.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findUserByUsername(String name);
}
