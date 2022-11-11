package com.example.webflux;

import com.example.webflux.entity.User;
import com.example.webflux.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import java.util.List;

@SpringBootApplication
public class WebfluxApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(WebfluxApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;



	@Override
	public void run(String... args) throws Exception {
		System.out.println("welcome here");
		List<User> userList = List.of(new User("Mahade_1", "22"),
				new User("Mahade_2", "23"),
				new User("Mahade_3", "24"),
				new User("Mahade_4", "25")
		);
		userRepository.deleteAll();
		userList.forEach(user->userRepository.save(user));
		//userRepository.saveAll(userList);
	}
}
