package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PatientProfile;
import com.example.demo.repository.PatientProfileRepository;
import com.example.demo.service.PatientProfileService;
@Service
public class PatientProfileServiceImpl implements PatientProfileService{
    // @Autowired PatientProfileRepository PatientPro;
    private final PatientProfileRepository PatientPro;
    public PatientProfileServiceImpl(PatientProfileRepository PatientPro){
    this.PatientPro=PatientPro;
    }
@Override
public PatientProfile createPatient(PatientProfile patient) {

    // 🔒 Check duplicate email
    if (PatientPro.existsByEmail(patient.getEmail())) {
        throw new IllegalArgumentException("Email already exists");
    }

    return PatientPro.save(patient);
}





    @Override
    public PatientProfile createPatient (PatientProfile patient){
        return PatientPro.save(patient);
    }
    @Override
    public PatientProfile getPatientById(Long id){
        return PatientPro.findById(id).orElse(null);
    }
    @Override
   public List<PatientProfile >getAllPatients(){
   return PatientPro.findAll();

}
@Override
public PatientProfile updatePatientStatus(Long id,Boolean active){
    PatientProfile p=PatientPro.findById(id).orElse(null);
    if(p!=null){
        p.setActive(!p.getActive());

        return PatientPro.save(p);
    }
    return null;
}

}
