package com.example.demo.service;

import java.util.List;

import com.example.demo.model.RecoveryCurveProfile;

public interface RecoveryCurveProfile{
RecoveryCurveProfile createCurveEntry(RecoveryCurveProfile curve);
// List<RecoveryCurveProfile> getCurveForSurgery(String surgeryType);
List<RecoveryCurveProfile> getAllCurves();
}

