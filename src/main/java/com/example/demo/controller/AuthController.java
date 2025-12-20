package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AppUser;
import com.example.demo.service.AuthService;

@RestController
public class AuthController {
    // @Autowired AuthService AS;
    private final AuthService AS;
    public AuthController(AuthService AS){
        
    }
    @PostMapping("/PM")
    public AppUser sendcreateregis(@RequestBody AppUser regis){
        return AS.createregis(regis);
    }
    @PostMapping("/pm")
    public AppUser sendcreatelogi(@RequestBody AppUser logi){
        return AS.createlogi(logi);
    }
}