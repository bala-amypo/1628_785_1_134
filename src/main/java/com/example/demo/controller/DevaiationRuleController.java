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
    @PostMapping("/POSTMAP")
    public DeviationRule sendcreateCurveEntry(@RequestBody DeviationRule entry){
        return DRS.createCurveEntry(entry);
    }
    @GetMapping("/GETMAP/{id}")
   public List<RDeviationRule> getgetCurveForSurgery(@PathVariable String surgeryType){
      return DRS.getCurveForSurgery(surgeryType);
   }
   @GetMapping("/GETMAP")
   public List<DeviationRule>getgetAllCurves(){
    return DRS.getAllCurves();
   }

   
}
