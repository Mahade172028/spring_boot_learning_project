package com.mahade.springdemo;

public class TrackCoach implements Coach {
    @Override
    public void getDailyWorkout() {
        System.out.println("30 mint Tracking ");
    }

    @Override
    public String getFortune() {

        return null;
    }
}
