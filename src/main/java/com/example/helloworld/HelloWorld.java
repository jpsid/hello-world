package com.example.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    String hello() {
        return "Hello World from Spring Boot!";
    }

    @RequestMapping("/hello/{name}")
    String helloName(@PathVariable("name") String name) {
        return "Hello " + name + " from Spring Boot!";
    }
}
