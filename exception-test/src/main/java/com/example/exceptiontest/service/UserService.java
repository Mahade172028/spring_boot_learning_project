package com.example.exceptiontest.service;

import com.example.exceptiontest.Entity;
import com.example.exceptiontest.exception.IntenalException;
import com.example.exceptiontest.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserInterface userInterface;

    public String test(String str) {
        Entity entity = new Entity("emon","djfdk","jhdf");
        entity.setName("Emon");
        entity.setAge("25");
        entity.setBari("borisal");
        System.out.println(entity);
        if(str.equals("A")){
            throw new ResourceNotFoundException("From the Service ");
        }
        if(str.equals("B")){
           int a = 9/0;
        }
        if(str.equals("C")){
            throw new IntenalException("Global Exception");
        }
        System.out.println(this.userInterface.workfun());

        return str;
    }

}
