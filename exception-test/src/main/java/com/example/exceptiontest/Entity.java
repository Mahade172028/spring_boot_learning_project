package com.example.exceptiontest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.annotation.Documented;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entity {
    private String name;
    private String age;
    private String bari;

    @Override
    public String toString() {
        return this.name +" "+ this.age +" "+ this.bari;
    }
}
