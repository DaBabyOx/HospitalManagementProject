package com.infosysb27.projectH.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "User")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String name;
    private LocalDate dateOfBirth;
    private char gender;

    @Column(unique = true)
    private String email;
    private String password;
    private String address;

public Long getIdUser(){
    return idUser;
}

public void setIdUser(Long newIdUser){
    this.idUser = newIdUser;
}

public String getName(){
    return name;
}

public void setName(String newName){
    this.name = newName;
}

public LocalDate setDateOfBirth(){
    return dateOfBirth;
}

public void getDateOfBirth(LocalDate newDateOfBirth){
    this.dateOfBirth = newDateOfBirth;
}

public char getGender(){
    return gender;
}

public void setGender(char newGender){
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
}