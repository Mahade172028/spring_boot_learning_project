package com.example.mongoautomation;

import com.example.mongoautomation.entity.AgendaName;
import com.example.mongoautomation.repository.AgendaPointRepository;
import com.example.mongoautomation.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MongoAutomationApplication{

	public static void main(String[] args) {
		SpringApplication.run(MongoAutomationApplication.class, args);
	}



}
