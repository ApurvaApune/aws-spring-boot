package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestprojectApplication {

	@GetMapping("/")
	public String home() {
		return "Welcome to AWS first deployment---------------";
	}
	public static void main(String[] args) {
		SpringApplication.run(TestprojectApplication.class, args);
	}

}
