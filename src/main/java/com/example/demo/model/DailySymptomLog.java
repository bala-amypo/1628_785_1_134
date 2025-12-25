package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "daily_symptom_logs")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DailySymptomLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientProfile patient;
    
    @Column(nullable = false)
    private LocalDate logDate;
    
    @Column(nullable = false)
    private Integer painLevel;
    
    @Column(nullable = false)
    private Integer mobilityLevel;
    
    @Column(nullable = false)
    private Integer fatigueLevel;
    
    private String notes;
    
    @Builder.Default
    private LocalDateTime submittedAt = LocalDateTime.now();
}