package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DeviationRule;
import com.example.demo.repository.DeviationRuleRepository;
import com.example.demo.service.DeviationRuleService;
@Service
public class DeviationRuleServiceImpl implements DeviationRuleService{
    @Autowired RecoveryCurveProfileRepository Recovery;
    @Override
    public RecoveryCurveProfile createCurveEntry (RecoveryCurveProfile entry){
        return Recovery.save(entry);
    }
    @Override
   public List<RecoveryCurveProfile >getAllCurves(){
   return Recovery.findAll();

}
@Override
  public List<RecoveryCurveProfile>getCurveForSurgery(String surgeryType){
      return Recovery.findBySurgeryTypeContaining(surgeryType);

   }

}
