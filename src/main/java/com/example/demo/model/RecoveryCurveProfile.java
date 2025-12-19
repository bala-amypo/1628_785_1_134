package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class RecoveryCurveProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String surgeryType;
    private int dayNumber;
    private int expectedPainLevel;
    private int expectedMobilityLevel;
    private int expectedFatigueLevel;
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
    public int getDayNumber() {
        return dayNumber;
    }
    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }
    public int getExpectedPainLevel() {
        return expectedPainLevel;
    }
    public void setExpectedPainLevel(int expectedPainLevel) {
        this.expectedPainLevel = expectedPainLevel;
    }
    public int getExpectedMobilityLevel() {
        return expectedMobilityLevel;
    }
    public void setExpectedMobilityLevel(int expectedMobilityLevel) {
        this.expectedMobilityLevel = expectedMobilityLevel;
    }
    public int getExpectedFatigueLevel() {
        return expectedFatigueLevel;
    }
    public void setExpectedFatigueLevel(int expectedFatigueLevel) {
        this.expectedFatigueLevel = expectedFatigueLevel;
    }
    public RecoveryCurveProfile(Long id, String surgeryType, int dayNumber, int expectedPainLevel,
            int expectedMobilityLevel, int expectedFatigueLevel) {
        this.id = id;
        this.surgeryType = surgeryType;
        this.dayNumber = dayNumber;
        this.expectedPainLevel = expectedPainLevel;
        this.expectedMobilityLevel = expectedMobilityLevel;
        this.expectedFatigueLevel = expectedFatigueLevel;
    }
    public RecoveryCurveProfile() {
    }
}
