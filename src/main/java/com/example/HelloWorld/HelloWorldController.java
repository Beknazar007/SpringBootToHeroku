package com.example.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloWorldController {
    @RequestMapping
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }
    @RequestMapping("/goodbye")
    public String goodbye(){
        return "Goodbye from java Spring Boot";
    }
}
