package com.example.demo.controller;

import com.example.demo.model.DeviationRule;
import com.example.demo.service.DeviationRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rules")
public class RuleController {

    @Autowired
    private DeviationRuleService ruleService;

    @GetMapping("/active")
    public ResponseEntity<List<DeviationRule>> getActiveRules() {
        return ResponseEntity.ok(ruleService.getActiveRules());
    }

    @GetMapping("/code/{ruleCode}")
    public ResponseEntity<DeviationRule> getRuleByCode(@PathVariable String ruleCode) {
        return ruleService.getRuleByCode(ruleCode)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DeviationRule> createRule(@RequestBody DeviationRule rule) {
        return ResponseEntity.ok(ruleService.createRule(rule));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DeviationRule> updateRule(@PathVariable Long id, @RequestBody DeviationRule rule) {
        DeviationRule updated = ruleService.updateRule(id, rule);
        return ResponseEntity.ok(updated);
    }
}