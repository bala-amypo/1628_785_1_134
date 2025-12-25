package com.example.demo.controller;

import com.example.demo.model.DailySymptomLog;
import com.example.demo.service.DailySymptomLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/symptoms")
public class SymptomLogController {

    private final DailySymptomLogService service;

    public SymptomLogController(DailySymptomLogService service) {
        this.service = service;
    }

    @PostMapping
    public DailySymptomLog save(@RequestBody DailySymptomLog log) {
        return service.save(log);
    }

    @GetMapping
    public List<DailySymptomLog> getAll() {
        return service.getAll();
    }
}
