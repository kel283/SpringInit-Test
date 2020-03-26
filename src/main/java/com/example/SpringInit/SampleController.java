package com.example.SpringInit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @RequestMapping("/")
    public String index() {
        return "Greeting from Spring Boot!";
    }

}