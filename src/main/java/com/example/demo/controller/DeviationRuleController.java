package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DeviationRule;
import com.example.demo.service.DeviationRuleService;

@RestController
public class DeviationRuleController {
    @Autowired DeviationRuleService DRS;
    @PostMapping("/POMA")
    public DeviationRule sendcreateRule(@RequestBody DeviationRule rule){
        return DRS.createRule(rule);
    }
    @GetMapping("/GEMA/{surgeryType}")
   public List<DeviationRule> getgetRulesBySurgery(@PathVariable String surgeryType){
      return DRS.getRulesBySurgery(surgeryType);
   }
   @GetMapping("/GEMA")
   public List<DeviationRule>getgetAllRules(){
    return DRS.getAllRules();
   }

   
}
