package com.example.springsecurity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityDemo {
    @GetMapping("/default")
    public  String securityValidate(){
        return "<h1>Welcomeeeee</h1>";
    }
    @GetMapping("/user")
    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public String userback(){
        return "I am user";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String adminback(){
        return "I am admin";
    }
}
