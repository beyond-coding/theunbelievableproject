package com.beyondcoding.theunbelievableproject.theunbelievableproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter")
public class CounterEndpoint {

    private int counter = 0;

    @GetMapping
    String showCounter(){
        return "The Unbelievable Project Counter: " + ++counter;
    }
}
