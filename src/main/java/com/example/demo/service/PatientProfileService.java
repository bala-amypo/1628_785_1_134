package com.example.demo.service;

import com.example.demo.model.PatientProfile;

public interface PatientProfileService {
    PatientProfile createPatient (PatientProfile patient);
    StudentEntity getPatientById(Long id);
}

