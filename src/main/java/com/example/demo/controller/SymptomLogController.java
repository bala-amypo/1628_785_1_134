package com.example.demo.controller;

import com.example.demo.model.DailySymptomLog;
import com.example.demo.service.DailySymptomLogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/symptoms")
public class SymptomLogController {

    private final DailySymptomLogService service;

    public SymptomLogController(DailySymptomLogService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<DailySymptomLog> recordLog(@RequestBody DailySymptomLog log) {
        return ResponseEntity.ok(service.recordSymptomLog(log));
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<List<DailySymptomLog>> getLogsByPatient(
            @PathVariable Long patientId) {
        return ResponseEntity.ok(service.getLogsByPatient(patientId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DailySymptomLog> updateLog(
            @PathVariable Long id,
            @RequestBody DailySymptomLog log) {
        return ResponseEntity.ok(service.updateSymptomLog(id, log));
    }
}
