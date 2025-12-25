package com.example.demo.service.impl;

import com.example.demo.model.DeviationRule;
import com.example.demo.repository.DeviationRuleRepository;
import com.example.demo.service.DeviationRuleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviationRuleServiceImpl implements DeviationRuleService {
    
    private final DeviationRuleRepository repository;
    
    public DeviationRuleServiceImpl(DeviationRuleRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public DeviationRule createRule(DeviationRule rule) {
        if (rule.getThresholdDeviation() <= 0) {
            throw new IllegalArgumentException("Threshold must be positive");
        }
        return repository.save(rule);
    }
    
    @Override
    public Optional<DeviationRule> getRuleByCode(String ruleCode) {
        return repository.findAll().stream()
                .filter(rule -> ruleCode.equals(rule.getSymptomParameter()))
                .findFirst();
    }
    
    @Override
    public List<DeviationRule> getActiveRules() {
        return repository.findAll().stream()
                .filter(DeviationRule::getActive)
                .toList();
    }
    
    @Override
    public DeviationRule updateRule(Long id, DeviationRule rule) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("not found");
        }
        rule.setId(id);
        return repository.save(rule);
    }
}