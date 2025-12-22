package com.example.demo.service;

import java.util.List;

import com.example.demo.model.PatientProfile;

public interface PatientProfileService {
    PatientProfile createPatient (PatientProfile patient);
    PatientProfile getPatientById(Long id);
    List<PatientProfile>getAllPatients();
    PatientProfile updatePatientStatus(Long id,Boolean active);
}

