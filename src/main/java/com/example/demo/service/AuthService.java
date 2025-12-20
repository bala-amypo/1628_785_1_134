package com.example.demo.service;

import com.example.demo.model.AppUser;

public interface AuthService {
    String createregis  (AppUser regis);
    String createlogi (AppUser logi);
}