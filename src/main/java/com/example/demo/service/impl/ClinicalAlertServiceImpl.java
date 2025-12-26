package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.ClinicalAlertRecord;
import com.example.demo.repository.ClinicalAlertRecordRepository;
import com.example.demo.service.ClinicalAlertService;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class ClinicalAlertServiceImpl implements ClinicalAlertService {

    private final ClinicalAlertRecordRepository repo;

    public ClinicalAlertServiceImpl(ClinicalAlertRecordRepository repo) {
        this.repo = repo;
    }

    public ClinicalAlertRecord resolveAlert(Long id) {
        ClinicalAlertRecord alert = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Alert not found"));
        alert.setResolved(true);
        return repo.save(alert);
    }

    public List<ClinicalAlertRecord> getAlertsByPatient(Long patientId) {
        return repo.findByPatientId(patientId);
    }

    public Optional<ClinicalAlertRecord> getAlertById(Long id) {
        return repo.findById(id);
    }

    public List<ClinicalAlertRecord> getAllAlerts() {
        return repo.findAll();
    }
}
