package com.example.basic.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @CrossOrigin(origins = "*")
    @GetMapping("/api/yes")
    public String test() {
        return "hi hi hi!!";
    }
}
