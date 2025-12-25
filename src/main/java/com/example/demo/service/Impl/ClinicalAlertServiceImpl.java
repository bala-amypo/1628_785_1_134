package com.example.demo.service.impl;

import com.example.demo.model.ClinicalAlert;
import com.example.demo.repository.ClinicalAlertRepository;
import com.example.demo.service.ClinicalAlertService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClinicalAlertServiceImpl implements ClinicalAlertService {
    
    private final ClinicalAlertRepository repository;
    
    public ClinicalAlertServiceImpl(ClinicalAlertRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public ClinicalAlert resolveAlert(Long id) {
        ClinicalAlert alert = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alert not found"));
        alert.setResolved(true);
        return repository.save(alert);
    }
    
    @Override
    public List<ClinicalAlert> getAlertsByPatient(Long patientId) {
        return repository.findByPatientId(patientId);
    }
    
    @Override
    public Optional<ClinicalAlert> getAlertById(Long id) {
        return repository.findById(id);
    }
    
    @Override
    public List<ClinicalAlert> getAllAlerts() {
        return repository.findAll();
    }
}