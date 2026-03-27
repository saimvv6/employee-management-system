package com.example.employeeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/health")
    @ResponseBody
    public String health() {
        return "Application is UP";
    }
    
    @GetMapping("/about")
    @ResponseBody
    public String about() {
    return "This app is for DevOps learning";
    }
}