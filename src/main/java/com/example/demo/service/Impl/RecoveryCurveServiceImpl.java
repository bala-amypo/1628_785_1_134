package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PatientProfile;
import com.example.demo.repository.PatientProfileRepository;
import com.example.demo.service.PatientProfileService;
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
