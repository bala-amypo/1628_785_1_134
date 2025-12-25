package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "patient_profiles")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatientProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true, nullable = false)
    private String patientId;
    
    @Column(nullable = false)
    private String fullName;
    
    private Integer age;
    
    @Column(unique = true, nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String surgeryType;
    
    @Builder.Default
    private Boolean active = true;
    
    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();
}