package com.example.demo.service;

import com.example.demo.model.DeviationRule;
import java.util.*;

public interface DeviationRuleService {
    DeviationRule createRule(DeviationRule rule);
    Optional<DeviationRule> getRuleByCode(String code);
    DeviationRule updateRule(Long id, DeviationRule rule);
    List<DeviationRule> getActiveRules();
}
