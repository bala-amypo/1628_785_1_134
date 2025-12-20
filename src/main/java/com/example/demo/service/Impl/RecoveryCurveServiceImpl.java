package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.RecoveryCurveProfile;
import com.example.demo.repository.RecoveryCurveRepository;
import com.example.demo.service.RecoveryCurveService;
@Service
public class PatientProfileServiceImpl implements PatientProfileService{
    @Autowired PatientProfileRepository PatientPro;
    @Override
    public PatientProfile createPatient (PatientProfile patient){
        return PatientPro.save(patient);
    }
    @Override
   public List<PatientProfile >getAllPatients(){
   return PatientPro.findAll();

}

}
