package com.example.demo.service;

import java.util.List;

import com.example.demo.model.RecoveryCurveProfile;

public interface PatientProfileService {
    PatientProfile createPatient (PatientProfile patient);
    PatientProfile getPatientById(Long id);
    List<PatientProfile>getAllPatients();
}

