package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "deviation_rules")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeviationRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String surgeryType;
    
    @Column(nullable = false)
    private String symptomParameter;
    
    @Column(nullable = false)
    private Integer thresholdDeviation;
    
    @Builder.Default
    private Boolean active = true;
}