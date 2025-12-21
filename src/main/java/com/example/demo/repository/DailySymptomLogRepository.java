package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DailySymptomLog;


@Repository
public interface DailySymptomLogRepository extends JpaRepository <DailySymptomLog,Long>{
    
}
