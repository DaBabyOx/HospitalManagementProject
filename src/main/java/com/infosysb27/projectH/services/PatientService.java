package com.infosysb27.projectH.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.infosysb27.projectH.models.Patient;
import com.infosysb27.projectH.models.User;
import com.infosysb27.projectH.repositories.PatientRepository;
import com.infosysb27.projectH.repositories.UserRepository;

@Service
public class PatientService {
    private final UserRepository userRepository;
    private final PatientRepository patientRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public PatientService(UserRepository userRepository, PatientRepository patientRepository){
        this.userRepository = userRepository;
        this.patientRepository = patientRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();}

    public Patient register(User user, String phone, String allergy){
        if(userRepository.findByEmail(user.getEmail()).isPresent()){
            throw new RuntimeException("This email is already used!");}

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

        Patient patient = new Patient();
        patient.setUser(user);
        patient.setPhone(phone);
        patient.setAllergy(allergy);

        return patientRepository.save(patient);}}