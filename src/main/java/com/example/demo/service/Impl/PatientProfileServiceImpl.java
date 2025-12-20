package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PatientProfile;
import com.example.demo.repository.PatientProfileRepository;

@Service
public interface PatientProfileServiceImpl implements PatientProfileService{
    @Autowired PatientProfileRepository patientp;
    @Override
    PatientProfile createPatient (PatientProfile patient){
        return patientp.save(patient);

    }
}
