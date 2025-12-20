package com.example.demo.service;

import java.util.List;
import com.example.demo.model.AppUser;

public interface AuthService {
    String createUser(AppUser user);
    AppUser getUserById(Long id);
    List<AppUser> getAllUser();
}