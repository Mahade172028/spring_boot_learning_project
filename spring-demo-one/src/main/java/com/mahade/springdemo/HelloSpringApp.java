package com.mahade.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = classPathXmlApplicationContext.getBean("MyCoach",Coach.class);
        coach.getDailyWorkout();
        System.out.println(coach.getFortune());
    }
}
