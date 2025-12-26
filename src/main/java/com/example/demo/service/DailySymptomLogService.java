package com.example.demo.service;

import com.example.demo.model.DailySymptomLog;

import java.util.List;

public interface DailySymptomLogService {

    // ✅ REQUIRED BY TESTS
    DailySymptomLog recordSymptomLog(DailySymptomLog log);

    // ✅ REQUIRED BY TESTS
    List<DailySymptomLog> getLogsByPatient(Long patientId);

    // ✅ REQUIRED BY TESTS
    DailySymptomLog updateSymptomLog(Long id, DailySymptomLog updatedLog);
}
