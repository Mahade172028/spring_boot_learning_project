package com.example.threadprogramming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;


public class ServiceHelper {
    Services services;
    ServiceHelper(Services services){
        this.services = services;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Services services1 = new Services();
        for (int i =0; i<4 ; i++){
            System.out.println(services1.test(i));
        }

    }




}
