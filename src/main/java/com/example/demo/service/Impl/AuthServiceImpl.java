package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AppUser;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.service.AuthService;
@Service
public class AuthServiceImpl implements AuthService{
    @Autowired AppUserRepository AU;
    @Override
    public AppUser createPatient (AppUser regis){
        return PatientPro.save(regis);
    }
    }