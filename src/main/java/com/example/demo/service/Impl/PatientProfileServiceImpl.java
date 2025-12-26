package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.PatientProfile;
import com.example.demo.repository.PatientProfileRepository;
import com.example.demo.service.PatientProfileService;

import java.util.*;

public class PatientProfileServiceImpl implements PatientProfileService {

    private final PatientProfileRepository repo;

    public PatientProfileServiceImpl(PatientProfileRepository repo) {
        this.repo = repo;
    }

    public PatientProfile createPatient(PatientProfile profile) {
        return repo.save(profile);
    }

    public PatientProfile getPatientById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found"));
    }

    public PatientProfile updatePatientStatus(Long id, boolean active) {
        PatientProfile p = getPatientById(id);
        p.setActive(active);
        return repo.save(p);
    }

    public List<PatientProfile> getAllPatients() {
        return repo.findAll();
    }

    public Optional<PatientProfile> findByPatientId(String patientId) {
        return repo.findByPatientId(patientId);
    }
}
