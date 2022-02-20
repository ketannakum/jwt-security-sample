package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JwtSecuritySample {

    public static void main(String[] args) {
        SpringApplication.run(JwtSecuritySample.class, args);
    }

    @RequestMapping(value = "/hello")
    public String getProductName() {
        return "Hello World";
    }
}
