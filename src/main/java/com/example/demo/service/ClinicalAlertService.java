package com.example.demo.service;

import com.example.demo.model.ClinicalAlert;
import java.util.List;
import java.util.Optional;

public interface ClinicalAlertService {
    ClinicalAlert resolveAlert(Long id);
    List<ClinicalAlert> getAlertsByPatient(Long patientId);
    Optional<ClinicalAlert> getAlertById(Long id);
    List<ClinicalAlert> getAllAlerts();
}