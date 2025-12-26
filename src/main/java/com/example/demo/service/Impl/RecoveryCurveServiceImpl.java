package com.example.demo.service.impl;

import com.example.demo.model.RecoveryCurveProfile;
import com.example.demo.repository.RecoveryCurveProfileRepository;
import com.example.demo.service.RecoveryCurveService;

import java.util.List;

public class RecoveryCurveServiceImpl implements RecoveryCurveService {

    private final RecoveryCurveProfileRepository repo;

    public RecoveryCurveServiceImpl(RecoveryCurveProfileRepository repo) {
        this.repo = repo;
    }

    public RecoveryCurveProfile createCurveEntry(RecoveryCurveProfile profile) {
        return repo.save(profile);
    }

    public List<RecoveryCurveProfile> getCurveForSurgery(String surgeryType) {
        return repo.findBySurgeryTypeOrderByDayNumberAsc(surgeryType);
    }

    public List<RecoveryCurveProfile> getAllCurves() {
        return repo.findAll();
    }
}
