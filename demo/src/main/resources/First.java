package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/name")
    public String sayname() {
        return "Sylvia charley";
    }
    @GetMapping("/address")
    public String sayaddress() {
        return "Coimbatore";
    }
    @GetMapping("/color")
    public String saycolor() {
        return "Black";
    }
}