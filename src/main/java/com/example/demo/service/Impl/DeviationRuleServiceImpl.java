package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DeviationRule;
import com.example.demo.repository.DeviationRuleRepository;
import com.example.demo.service.DeviationRuleService;
@Service
public class DeviationRuleServiceImpl implements DeviationRuleService{
    @Autowired DeviationRuleRepository Rule;
    @Override
    public DeviationRule createCurveEntry (DeviationRule rule){
        return Rule.save(rule);
    }
    @Override
  public List<DeviationRule>getCurveForSurgery(String surgeryType){
      return Rule.findBySurgeryTypeContaining(surgeryType);

   }
    @Override
   public List<DeviationRule>getAllRules(){
   return Rule.findAllRules();

}


}
