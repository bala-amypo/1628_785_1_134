package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.*;
import com.example.demo.repository.DailySymptomLogRepository;
import com.example.demo.repository.PatientProfileRepository;
import com.example.demo.service.*;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DailySymptomLogServiceImpl implements DailySymptomLogService {

    private final DailySymptomLogRepository logRepo;
    private final PatientProfileRepository patientRepo;
    private final RecoveryCurveService recoveryCurveService;
    private final DeviationRuleService ruleService;
    private final ClinicalAlertService alertService;

    public DailySymptomLogServiceImpl(
            DailySymptomLogRepository logRepo,
            PatientProfileRepository patientRepo,
            RecoveryCurveService recoveryCurveService,
            DeviationRuleService ruleService,
            ClinicalAlertService alertService
    ) {
        this.logRepo = logRepo;
        this.patientRepo = patientRepo;
        this.recoveryCurveService = recoveryCurveService;
        this.ruleService = ruleService;
        this.alertService = alertService;
    }

    @Override
    public DailySymptomLog recordSymptomLog(DailySymptomLog log) {

        PatientProfile patient = patientRepo.findById(log.getPatientId())
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found"));

        if (logRepo.findByPatientIdAndLogDate(
                log.getPatientId(),
                log.getLogDate()).isPresent()) {
            throw new IllegalArgumentException("Duplicate log for date");
        }

        return logRepo.save(log);
    }

    @Override
    public List<DailySymptomLog> getLogsByPatient(Long patientId) {
        patientRepo.findById(patientId)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found"));

        return logRepo.findByPatientId(patientId);
    }

    @Override
    public DailySymptomLog updateSymptomLog(Long id, DailySymptomLog updated) {

        DailySymptomLog existing = logRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Log not found"));

        PatientProfile patient = patientRepo.findById(updated.getPatientId())
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found"));

        existing.setPainLevel(updated.getPainLevel());
        existing.setMobilityLevel(updated.getMobilityLevel());
        existing.setFatigueLevel(updated.getFatigueLevel());
        existing.setAdditionalNotes(updated.getAdditionalNotes());
        existing.setPatientId(patient.getId());

        return logRepo.save(existing);
    }
}
