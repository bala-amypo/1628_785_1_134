package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clinical_alerts")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClinicalAlert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientProfile patient;
    
    @Column(nullable = false)
    private LocalDate alertDate;
    
    @Column(nullable = false)
    private String severity;
    
    @Column(nullable = false)
    private String message;
    
    @Builder.Default
    private Boolean resolved = false;
}