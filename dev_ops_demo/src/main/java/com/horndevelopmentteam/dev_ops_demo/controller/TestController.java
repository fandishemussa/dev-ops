package com.horndevelopmentteam.dev_ops_demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/public/hello")
    public String publicHello() {
        return "Public endpoint";
    }

    @GetMapping("/secure/hello")
    public String secureHello(Authentication authentication) {
        return "Hello, " + authentication.getName();
    }
}