package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class ClinicalAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean resolved;

    // ✅ GETTERS
    public Long getId() {
        return id;
    }

    public boolean isResolved() {
        return resolved;
    }

    // ✅ SETTERS
    public void setId(Long id) {
        this.id = id;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }
}
