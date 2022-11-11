package com.example.threadprogramming.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
public class ThreadConfig {

    @Bean
    public Executor threadExecutor(){
        ThreadPoolTaskExecutor executorService = new ThreadPoolTaskExecutor();
        executorService.setCorePoolSize(3);
        executorService.setMaxPoolSize(3);
        executorService.setQueueCapacity(100);
        executorService.setThreadNamePrefix("userThread _");
        executorService.initialize();
        return executorService;
    }
}
