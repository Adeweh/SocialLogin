package com.example.sociallogin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialLoginController {

    @GetMapping("/")
    public String home(){

        return "Login Successful";
    }
    @GetMapping("/login")
    public String login(){
        return "Hello User";
    }
}
