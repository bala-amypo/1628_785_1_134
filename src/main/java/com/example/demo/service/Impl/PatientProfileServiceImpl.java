package com.example.demo.service.impl;

import com.example.demo.model.PatientProfile;
import com.example.demo.repository.PatientProfileRepository;
import com.example.demo.service.PatientProfileService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientProfileServiceImpl implements PatientProfileService {
    
    private final PatientProfileRepository repository;
    
    public PatientProfileServiceImpl(PatientProfileRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public PatientProfile createPatient(PatientProfile profile) {
        if (repository.findByEmail(profile.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email already exists");
        }
        return repository.save(profile);
    }
    
    @Override
    public PatientProfile getPatientById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
    }
    
    @Override
    public PatientProfile updatePatientStatus(Long id, Boolean active) {
        PatientProfile patient = getPatientById(id);
        patient.setActive(active);
        return repository.save(patient);
    }
    
    @Override
    public Optional<PatientProfile> findByPatientId(String patientId) {
        return repository.findByPatientId(patientId);
    }
    
    @Override
    public List<PatientProfile> getAllPatients() {
        return repository.findAll();
    }
}