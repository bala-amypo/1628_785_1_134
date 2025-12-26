package com.example.demo.service.Impl;

import com.example.demo.model.DailySymptomLog;
import com.example.demo.repository.DailySymptomLogRepository;
import com.example.demo.service.DailySymptomLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailySymptomLogServiceImpl implements DailySymptomLogService {

    @Autowired
    private DailySymptomLogRepository repository;

    @Override
    public DailySymptomLog save(DailySymptomLog log) {
        return repository.save(log);
    }

    @Override
    public List<DailySymptomLog> getAll() {
        return repository.findAll();
    }

    @Override
    public DailySymptomLog getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
