package com.RezaAk.web.Strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//RestController is used to mark a class as Spring MVC Controller
@SpringBootApplication
@RestController


public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}

	//When open the main page: http://localhost:8080/
	@RequestMapping("/")
	public String hello() {
		return "Hello client! How are you doing?";
	}
	
	
	//when open the random page: http://localhost:8080/random
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great! So easy to just respond with strings";
	}
	
	
}
