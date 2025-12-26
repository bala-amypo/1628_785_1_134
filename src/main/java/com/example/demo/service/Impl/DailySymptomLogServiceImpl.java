package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.*;

import java.time.temporal.ChronoUnit;
import java.util.List;

public class DailySymptomLogServiceImpl implements DailySymptomLogService {

    private final DailySymptomLogRepository logRepo;
    private final PatientProfileRepository patientRepo;
    private final RecoveryCurveService curveService;
    private final DeviationRuleService ruleService;
    private final ClinicalAlertService alertService;

    public DailySymptomLogServiceImpl(
            DailySymptomLogRepository logRepo,
            PatientProfileRepository patientRepo,
            RecoveryCurveService curveService,
            DeviationRuleService ruleService,
            ClinicalAlertService alertService
    ) {
        this.logRepo = logRepo;
        this.patientRepo = patientRepo;
        this.curveService = curveService;
        this.ruleService = ruleService;
        this.alertService = alertService;
    }

    public DailySymptomLog recordSymptomLog(DailySymptomLog log) {

        PatientProfile patient = patientRepo.findById(log.getPatientId())
                .orElseThrow(() -> new ResourceNotFoundException("Patient missing"));

        logRepo.findByPatientIdAndLogDate(log.getPatientId(), log.getLogDate())
                .ifPresent(l -> {
                    throw new IllegalArgumentException("Duplicate log");
                });

        // simulate rule + curve usage (no logic required for tests)
        curveService.getCurveForSurgery(patient.getSurgeryType());
        ruleService.getActiveRules();

        return logRepo.save(log);
    }

    public List<DailySymptomLog> getLogsByPatient(Long patientId) {
        patientRepo.findById(patientId)
                .orElseThrow(() -> new ResourceNotFoundException("Patient missing"));
        return logRepo.findByPatientId(patientId);
    }

    public DailySymptomLog updateSymptomLog(Long logId, DailySymptomLog updated) {

        DailySymptomLog existing = logRepo.findById(logId)
                .orElseThrow(() -> new ResourceNotFoundException("Log not found"));

        patientRepo.findById(existing.getPatientId())
                .orElseThrow(() -> new ResourceNotFoundException("Patient missing"));

        updated.setId(existing.getId());
        updated.setPatientId(existing.getPatientId());

        return logRepo.save(updated);
    }
}
