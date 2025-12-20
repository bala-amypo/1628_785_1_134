package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.RecoveryCurveProfile;
import com.example.demo.repository.RecoveryCurveProfileRepository;
import com.example.demo.service.RecoveryCurveService;
@Service
public class RecoveryCurveServiceImpl implements RecoveryCurveService{
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
  public List<RecoveryCurveProfile>getCurveForSurgery(@PathVariable String surgeryType){
      return repo.findBySurgeryTypeContaining(surgeryType);

   }

}
