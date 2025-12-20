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
public class RecoveryCurveController {
    @Autowired RecoveryCurveService RCS;
    @PostMapping("/POSTMAP")
    public RecoveryCurveProfile sendcreateCurveEntry(@RequestBody RecoveryCurveProfile entry){
        return RCS.createCurveEntry(entry);
    }
//     @GetMapping("/GET/{id}")
//    public RecoveryCurveProfile getgetPatientById(@PathVariable Long id){
//      return PPS.getPatientById(id);
//    }
   @GetMapping("/GETMAP")
   public List<RecoveryCurveProfile>getgetAllCurves(){
    return RCS.getAllCurves();
   }

}
