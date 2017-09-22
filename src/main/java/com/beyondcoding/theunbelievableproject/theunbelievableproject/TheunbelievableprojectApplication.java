package com.beyondcoding.theunbelievableproject.theunbelievableproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@SpringBootApplication
public class TheunbelievableprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheunbelievableprojectApplication.class, args);
	}

    @GetMapping
	String message(){
	    return "The Unbelievable Project";
    }
}
