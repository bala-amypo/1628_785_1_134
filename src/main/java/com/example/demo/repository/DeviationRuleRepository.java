package com.example.demo.repository;

import com.example.demo.model.DeviationRule;
import java.util.*;

public interface DeviationRuleRepository {
    Optional<DeviationRule> findById(Long id);
    Optional<DeviationRule> findByRuleCode(String code);
    List<DeviationRule> findByActiveTrue();
    DeviationRule save(DeviationRule rule);
}
