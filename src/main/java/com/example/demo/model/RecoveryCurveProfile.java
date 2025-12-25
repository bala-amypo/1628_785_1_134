package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "recovery_curve_profiles")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecoveryCurveProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String surgeryType;
    
    @Column(nullable = false)
    private Integer dayNumber;
    
    @Column(nullable = false)
    private Integer expectedPainLevel;
    
    @Column(nullable = false)
    private Integer expectedMobilityLevel;
    
    @Column(nullable = false)
    private Integer expectedFatigueLevel;
}