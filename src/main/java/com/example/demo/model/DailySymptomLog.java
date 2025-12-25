package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class DailySymptomLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logDate;
    private int painLevel;
    private int mobilityLevel;
    private int fatigueLevel;
    private String notes;

    // ✅ GETTERS
    public Long getId() {
        return id;
    }

    public String getLogDate() {
        return logDate;
    }

    public int getPainLevel() {
        return painLevel;
    }

    public int getMobilityLevel() {
        return mobilityLevel;
    }

    public int getFatigueLevel() {
        return fatigueLevel;
    }

    public String getNotes() {
        return notes;
    }

    // ✅ SETTERS
    public void setId(Long id) {
        this.id = id;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

    public void setPainLevel(int painLevel) {
        this.painLevel = painLevel;
    }

    public void setMobilityLevel(int mobilityLevel) {
        this.mobilityLevel = mobilityLevel;
    }

    public void setFatigueLevel(int fatigueLevel) {
        this.fatigueLevel = fatigueLevel;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
