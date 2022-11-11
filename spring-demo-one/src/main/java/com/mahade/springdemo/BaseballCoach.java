package com.mahade.springdemo;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public void getDailyWorkout(){
        System.out.println("Do 30mint batting  practice");
    }

    @Override
    public String getFortune() {

        return fortuneService.getFortune();
    }
}
