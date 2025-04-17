package com.example.mongotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MongoTestApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello, MongoDB!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MongoTestApplication.class, args);
    }

}
