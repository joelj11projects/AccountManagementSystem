package com.qa.com.qa.MainSystem;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springboot {
	
	public static void main(String[] args) {
        SpringApplication.run(Springboot.class, args);
        
    }
	@RequestMapping
	public String home() {
		return "Hello Wordddld!22";
	}

}
