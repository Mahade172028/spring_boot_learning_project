package com.example.threadprogramming.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class Services {
    @Async
    public CompletableFuture<String> test(Integer thread) throws InterruptedException {

        String name = "String";
        System.out.println("thread working  "+thread);
        Thread.sleep(3000);
        System.out.println("Working finish of "+thread);
        //System.out.println(Thread.currentThread().getName());
        return CompletableFuture.completedFuture(name);
    }

}
