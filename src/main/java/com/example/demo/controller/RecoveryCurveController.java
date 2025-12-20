package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RecoveryCurveProfile;
import com.example.demo.service.RecoveryCurveService;

@RestController
public class PatientProfileController {
    @Autowired PatientProfileService PPS;
    @PostMapping("/POST")
    public PatientProfile sendcreatePatient(@RequestBody PatientProfile patient){
        return PPS.createPatient(patient);
    }
//     @GetMapping("/GET/{id}")
//    public PatientProfile getgetPatientById(@PathVariable Long id){
//      return PPS.getPatientById(id);
//    }
   @GetMapping("/GET")
   public List<PatientProfile>getgetAllPatients(){
    return PPS.getAllPatients();
   }

}
