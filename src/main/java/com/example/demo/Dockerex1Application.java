package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Dockerex1Application {

	public static void main(String[] args) {
		SpringApplication.run(Dockerex1Application.class, args);
	}
	@GetMapping("/test")
    public String hello(){return "hello";}
}
