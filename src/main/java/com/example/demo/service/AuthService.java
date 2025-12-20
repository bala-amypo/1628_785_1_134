package com.example.demo.service;

import com.example.demo.model.AppUser;

public interface AuthService {
    AppUser createregis (AppUser regis);
    AppUser createlogi (AppUser logi);
}