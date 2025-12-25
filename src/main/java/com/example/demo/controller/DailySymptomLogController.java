package com.example.demo.controller;

import com.example.demo.model.DailySymptomLog;
import com.example.demo.service.DailySymptomLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/symptom-logs")
public class SymptomLogController {

    @Autowired
    private DailySymptomLogService symptomLogService;

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<List<DailySymptomLog>> getSymptomLogsByPatientId(@PathVariable Long patientId) {
        return ResponseEntity.ok(symptomLogService.getLogsByPatient(patientId));
    }

    @PostMapping
    public ResponseEntity<DailySymptomLog> createSymptomLog(@RequestBody DailySymptomLog log) {
        return ResponseEntity.ok(symptomLogService.recordSymptomLog(log));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DailySymptomLog> updateSymptomLog(@PathVariable Long id, @RequestBody DailySymptomLog log) {
        DailySymptomLog updated = symptomLogService.updateSymptomLog(id, log);
        return ResponseEntity.ok(updated);
    }
}