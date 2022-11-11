package com.example.webflux.controller;

import com.example.webflux.entity.User;
import com.example.webflux.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.CoreSubscriber;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.concurrent.Delayed;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    Flux<String> fluxList = Flux.just("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
            .delayElements(Duration.ofSeconds(1));

    @PostMapping("/add-flux")
    public Mono<User> addflux(@RequestBody User user){
        System.out.println(user);
        return userRepository.save(user);
    }

    @GetMapping(value = "/all-user",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<User> getallUser(){
        return userRepository.findAll().delayElements(Duration.ofSeconds(1));
        }

        public Flux<String> returnStram(){
           return fluxList;
        }

    public void addFLux(String item){
        fluxList = Flux.concat(fluxList,Flux.just(item));
    }

}
