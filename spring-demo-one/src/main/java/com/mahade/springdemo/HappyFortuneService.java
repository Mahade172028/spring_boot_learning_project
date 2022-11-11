package com.mahade.springdemo;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Hey new Fortune Service";
    }
}
