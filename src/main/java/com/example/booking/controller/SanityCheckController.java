package com.example.booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SanityCheckController {

    @GetMapping("/ping")
    public String ping() {
        return "Booking API is up and running!";
    }
}
