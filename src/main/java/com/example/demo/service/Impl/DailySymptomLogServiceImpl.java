package com.example.demo.service.impl;

import com.example.demo.model.DailySymptomLog;
import com.example.demo.repository.DailySymptomLogRepository;
import com.example.demo.service.DailySymptomLogService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DailySymptomLogServiceImpl implements DailySymptomLogService {
    
    private final DailySymptomLogRepository repository;
    
    public DailySymptomLogServiceImpl(DailySymptomLogRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public DailySymptomLog recordSymptomLog(DailySymptomLog log) {
        if (log.getLogDate().isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("future date");
        }
        return repository.save(log);
    }
    
    @Override
    public List<DailySymptomLog> getLogsByPatient(Long patientId) {
        return repository.findByPatientId(patientId);
    }
    
    @Override
    public DailySymptomLog updateSymptomLog(Long id, DailySymptomLog log) {
        DailySymptomLog existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
        existing.setPainLevel(log.getPainLevel());
        existing.setMobilityLevel(log.getMobilityLevel());
        existing.setFatigueLevel(log.getFatigueLevel());
        existing.setNotes(log.getNotes());
        return repository.save(existing);
    }
}