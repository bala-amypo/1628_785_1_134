package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AppUser;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.service.AuthService;
@Service
public class AuthServiceImpl implements AuthService{
    // @Autowired AppUserRepository AUR;
    private final AppUserRepository AUR;
    public AuthServiceImpl(AppUserRepository AUR){
        this.AUR=AUR;
    }

    @Override
    public String createregis (AppUser regis){
            AUR.save(regis);
               return "Register Successfully";
    }
    @Override
    public String createlogi (AppUser logi){
             AUR.save(logi);
               return "Logic Successfully";

    }
}