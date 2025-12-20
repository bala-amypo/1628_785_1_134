package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PatientProfile;
import com.example.demo.service.PatientProfileService;

@RestController
public class PatientProfileController {
    // @Autowired PatientProfileService PPS;
    private final PatientProfileService PPS;
    public PatientProfileController(PatientProfileService PPS){
        this.PPS=PPS;
    }
    @PostMapping("/POST")
    public PatientProfile sendcreatePatient(@RequestBody PatientProfile patient){
        return PPS.createPatient(patient);
    }
    @GetMapping("/GET/{id}")
   public PatientProfile getgetPatientById(@PathVariable Long id){
     return PPS.getPatientById(id);
   }
   @GetMapping("/GET")
   public List<PatientProfile>getgetAllPatients(){
    return PPS.getAllPatients();
   }

   @PutMapping("/PUT/{id}/status")
   public PatientProfile putupdatePatientStatus(@PathVariable Long id,@RequestBody Boolean active){
    return PPS.updatePatientStatus(id,active);
   }


}
