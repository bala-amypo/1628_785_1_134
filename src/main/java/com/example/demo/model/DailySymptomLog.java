package com.example.demo.model;

import java.time.LocalDateTime;
import java.time.LocalDate;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class DailySymptomLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patient;
    private String fullName;
    private LocalDate logDate;
    private int painLevel;
    private int mobilityLevel;
    private Boolean active;
    private LocalDateTime createdAt;
    
}
