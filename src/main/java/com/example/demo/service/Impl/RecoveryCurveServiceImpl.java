package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.RecoveryCurveProfile;
import com.example.demo.repository.RecoveryCurveRepository;
import com.example.demo.service.RecoveryCurveService;
@Service
public class RecoveryCurveServiceImpl implements RecoveryCurveService{
    @Autowired RecoveryCurveProfileRepository Recovery;
    @Override
    public RecoveryCurveProfile createCurveEntry (RecoveryCurveProfile patient){
        return Recovery.save(patient);
    }
    @Override
   public List<RecoveryCurveProfile >getAllPatients(){
   return Recovery.findAll();

}

}
