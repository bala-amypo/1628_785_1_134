package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.RecoveryCurveProfile;
import com.example.demo.repository.RecoveryCurveProfileRepository;
import com.example.demo.service.RecoveryCurveService;
@Service
public class RecoveryCurveServiceImpl implements RecoveryCurveService{
    // @Autowired RecoveryCurveProfileRepository Recovery;
    private final  RecoveryCurveProfileRepository Recovery;
    public RecoveryCurveServiceImpl(RecoveryCurveProfileRepository Recovery){
         this.Recovery=Recovery;
    }
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
