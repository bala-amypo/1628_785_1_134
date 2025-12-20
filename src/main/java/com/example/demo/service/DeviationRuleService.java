package com.example.demo.service;

import java.util.List;

import com.example.demo.model.DeviationRule;

public interface DeviationRuleService{
DeviationRule createCurveEntry(DeviationRule curve);
List<DeviationRule> getRulesBySurgery(String surgeryType);
List<DeviationRule> getAllRules();
}

