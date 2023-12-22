package com.demo.patient.controller;


import com.demo.patient.model.Patient;
import com.demo.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
@CrossOrigin("*")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;


    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Patient> getAllRecords() {
        return patientRepository.findAll();
    }
}
