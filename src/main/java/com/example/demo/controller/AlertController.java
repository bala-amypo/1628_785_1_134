package com.example.demo.controller;

import com.example.demo.model.ClinicalAlert;
import com.example.demo.service.ClinicalAlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class AlertController {

    @Autowired
    private ClinicalAlertService alertService;

    @GetMapping
    public ResponseEntity<List<ClinicalAlert>> getAllAlerts() {
        return ResponseEntity.ok(alertService.getAllAlerts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClinicalAlert> getAlertById(@PathVariable Long id) {
        return alertService.getAlertById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<List<ClinicalAlert>> getAlertsByPatientId(@PathVariable Long patientId) {
        return ResponseEntity.ok(alertService.getAlertsByPatient(patientId));
    }

    @PutMapping("/{id}/resolve")
    public ResponseEntity<ClinicalAlert> resolveAlert(@PathVariable Long id) {
        ClinicalAlert resolved = alertService.resolveAlert(id);
        return ResponseEntity.ok(resolved);
    }
}