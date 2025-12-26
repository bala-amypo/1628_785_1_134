package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.DeviationRule;
import com.example.demo.repository.DeviationRuleRepository;
import com.example.demo.service.DeviationRuleService;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class DeviationRuleServiceImpl implements DeviationRuleService {

    private final DeviationRuleRepository repo;

    public DeviationRuleServiceImpl(DeviationRuleRepository repo) {
        this.repo = repo;
    }

    public DeviationRule createRule(DeviationRule rule) {
        return repo.save(rule);
    }

    public Optional<DeviationRule> getRuleByCode(String code) {
        return repo.findByRuleCode(code);
    }

    public DeviationRule updateRule(Long id, DeviationRule rule) {
        DeviationRule existing = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Rule not found"));
        rule.setId(existing.getId());
        return repo.save(rule);
    }

    public List<DeviationRule> getActiveRules() {
        return repo.findByActiveTrue();
    }
}
