package com.example.demo.controller;

import com.example.demo.model.RecoveryCurveProfile;
import com.example.demo.service.RecoveryCurveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recovery-curves")
public class RecoveryCurveController {

    @Autowired
    private RecoveryCurveService recoveryCurveService;

    @GetMapping
    public ResponseEntity<List<RecoveryCurveProfile>> getAllRecoveryCurves() {
        return ResponseEntity.ok(recoveryCurveService.getAllCurves());
    }

    @GetMapping("/surgery/{surgeryType}")
    public ResponseEntity<List<RecoveryCurveProfile>> getCurveForSurgery(@PathVariable String surgeryType) {
        return ResponseEntity.ok(recoveryCurveService.getCurveForSurgery(surgeryType));
    }

    @PostMapping
    public ResponseEntity<RecoveryCurveProfile> createRecoveryCurve(@RequestBody RecoveryCurveProfile curve) {
        return ResponseEntity.ok(recoveryCurveService.createCurveEntry(curve));
    }
}