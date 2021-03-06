package com.sagar.Dashboard.controller;


import com.sagar.Dashboard.entity.Patient;
import com.sagar.Dashboard.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("api/patient")
    public Patient addPatient(@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }

    @GetMapping("api/patient")
    public List<Patient> getAllPatients(){
        return patientService.getAllPatient();
    }

    @GetMapping("api/patient/{id}")
    public Patient getPatientById(@PathVariable("id") Long id){
        return  patientService.getPatientById(id);
    }

    @PutMapping("api/patient/{id}")
    public Patient updatePatient(@PathVariable("id") Long id,@RequestBody Patient patient){
        return patientService.updatePatient(id,patient);
    }

    @DeleteMapping("api/patient/{id}")
    public void deletePatientById(@PathVariable("id") Long id) {

        patientService.deletePatientById(id);

    }

}
