package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskMangerBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskMangerBackEndApplication.class, args);
		System.out.println("Server is running");
	}

}
