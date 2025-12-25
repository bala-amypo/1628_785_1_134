package com.example.demo.repository;

import com.example.demo.model.DailySymptomLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailySymptomLogRepository 
        extends JpaRepository<DailySymptomLog, Long> {
}
