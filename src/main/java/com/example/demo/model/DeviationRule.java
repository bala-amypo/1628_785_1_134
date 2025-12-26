package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class DeviationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String symptomParameter;
    private double thresholdDeviation;
    private boolean active;

    // ✅ GETTERS
    public Long getId() {
        return id;
    }

    public String getSymptomParameter() {
        return symptomParameter;
    }

    public double getThresholdDeviation() {
        return thresholdDeviation;
    }

    public boolean getActive() {
        return active;
    }

    // ✅ SETTERS
    public void setId(Long id) {
        this.id = id;
    }

    public void setSymptomParameter(String symptomParameter) {
        this.symptomParameter = symptomParameter;
    }

    public void setThresholdDeviation(double thresholdDeviation) {
        this.thresholdDeviation = thresholdDeviation;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
