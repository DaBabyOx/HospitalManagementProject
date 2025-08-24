package com.infosysb27.projectH.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.infosysb27.projectH.services.PatientService;
import com.infosysb27.projectH.models.User;
import com.infosysb27.projectH.DTO.PatientSignUpRequest;;


@RestController
@RequestMapping("/api/patient")
public class PatientController {
    
    private final PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService = patientService;}
    
    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody PatientSignUpRequest request){
        try{
            User user = new User();
            user.setName(request.getName());
            user.setEmail(request.getEmail());
            user.setPassword(request.getPassword());
            user.setDateOfBirth(request.getDateOfBirth());
            user.setGender(request.getGender());
            user.setAddress(request.getAddress());

            patientService.registerPatient(user, request.getPhone(), request.getAllergy());
            return ResponseEntity.ok("Patient registered!");}
        catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());}
    }
}
