package com.example.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class DeviationRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String surgeryType;
    private String symptomParameter;
    private int thresholdDevation;
    private Boolean active;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getSurgeryType() {
        return surgeryType;
    }
    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }
    public String getSymptomParameter() {
        return symptomParameter;
    }
    public void setSymptomParameter(String symptomParameter) {
        this.symptomParameter = symptomParameter;
    }
    public int getThresholdDevation() {
        return thresholdDevation;
    }
    public void setThresholdDevation(int thresholdDevation) {
        this.thresholdDevation = thresholdDevation;
    }
    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
    public DeviationRule(Long id, String surgeryType, String symptomParameter, int thresholdDevation, Boolean active) {
        this.id = id;
        this.surgeryType = surgeryType;
        this.symptomParameter = symptomParameter;
        this.thresholdDevation = thresholdDevation;
        this.active = active;
    }
    public DeviationRule() {
    }

}
