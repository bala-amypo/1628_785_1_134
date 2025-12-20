package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AppUser;
import com.example.demo.service.PatientProfileService;

@RestController
public class AuthController {
    @Autowired Service PPS;
    @PostMapping("/POST")
    public AppUser sendcreatePatient(@RequestBody AppUser patient){
        return PPS.createPatient(patient);
    }
}