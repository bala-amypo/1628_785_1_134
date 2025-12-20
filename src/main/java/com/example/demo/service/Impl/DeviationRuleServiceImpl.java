package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DeviationRule;
import com.example.demo.repository.DeviationRuleRepository;
import com.example.demo.service.DeviationRuleService;
@Service
public class DeviationRuleServiceImpl implements DeviationRuleService{
    // @Autowired DeviationRuleRepository Rule;
    private final DeviationRuleRepository Rule;
    public DeviationRuleServiceImpl(DeviationRuleRepository Rule){
         this.Rule=Rule;
    }
    @Override
    public DeviationRule createRule (DeviationRule rule){
        return Rule.save(rule);
    }
    @Override
  public List<DeviationRule>getRulesBySurgery(String surgeryType){
      return Rule.findBySurgeryTypeContaining(surgeryType);

   }
    @Override
   public List<DeviationRule>getAllRules(){
   return Rule.findAll();

}


}
