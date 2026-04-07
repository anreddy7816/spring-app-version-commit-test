package com.git.test.services.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class TestController {


    @GetMapping
    public String testApp(){
        return "Welcome to Spring Boot V2";
    }
}
