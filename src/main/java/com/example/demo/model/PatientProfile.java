package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class PatientProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private Boolean active;

    // ✅ GETTERS
    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getActive() {
        return active;
    }

    // ✅ SETTERS
    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
