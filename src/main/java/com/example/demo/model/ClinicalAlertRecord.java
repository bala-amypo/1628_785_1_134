package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ClinicalAlertRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long patientId;

    // ✅ REQUIRED BY TESTS
    private Long logId;

    private String alertType;

    // ✅ REQUIRED BY TESTS
    private String severity;

    private String message;

    // ✅ MUST DEFAULT TO FALSE
    @Builder.Default
    private Boolean resolved = false;

    private LocalDateTime createdAt;
}
