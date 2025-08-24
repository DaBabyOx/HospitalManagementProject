package com.infosysb27.projectH.DTO;

import java.time.LocalDate;

public class PatientSignUpRequest {
    private String name;
    private LocalDate dateOfBirth;
    private char gender;
    private String email;
    private String password;
    private String address;
    private String phone;
    private String allergy;
    
public String getName(){
    return name;
}

public void setName(String newName){
    this.name = newName;
}

public LocalDate getDateOfBirth(){
    return dateOfBirth;
}

public void setDateOfBirth(String newDateOfBirth){
    this.dateOfBirth = newDateOfBirth;
}

public char getGender(){
    return gender;
}

public void setGender(String newGender){
    this.gender = newGender;
}

public String getEmail(){
    return email;
}

public void setEmail(String newEmail){
    this.email = newEmail;
}

public String getPassword(){
    return password;
}

public void setPassword(String newPassword){
    this.password = newPassword;
}

public String getAddress(){
    return address;
}

public void setAddress(String newAddress){
    this.address = newAddress;
}

public String getPhone(){
    return phone;
}

public void setPhone(String newPhone){
    this.phone = newPhone;
}

public String getAllergy(){
    return allergy;
}

public void setAllergy(String newAllergy){
    this.allergy = newAllergy;
}
}
