package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PatientProfile;
import com.example.demo.service.PatientProfileService;

@RestController
public class PatientProfileController {
    @Autowired PatientProfileService PPS;
    @PostMapping("/POST")
    public PatientProfile sendcreatePatient(@RequestBody PatientProfile patient){
        return PPS.createPatient(patient);
    }
}