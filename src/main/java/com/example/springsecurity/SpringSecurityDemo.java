package com.example.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityDemo {
    @GetMapping("/")
    public  String securityValidate(){
        return "<h1>Welcomeeeee</h1>";
    }
}
