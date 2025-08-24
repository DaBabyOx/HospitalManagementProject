package com.infosysb27.projectH.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "User")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUser;
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

public void setIdUser(long newIdUser){
    this.idUser = idUser;
}

public String getName(){
    return name;
}

public void setName(String newName){
    this.name = name;
}

public LocalDate setDateOfBirth(){
    return dateOfBirth;
}

public void getDateOfBirth(LocalDate newDateOfBirth){
    this.dateOfBirth = dateOfBirth;
}

public char getGender(){
    return gender;
}

public void setGender(char newGender){
    this.gender = gender;
}

public String getEmail(){
    return email;
}

public void setEmail(String newEmail){
    this.email = email;
}

public String getPassword(){
    return password;
}

public void setPassword(String newPassword){
    this.password = password;
}

public String getAddress(){
    return address;
}

public void setAddress(String newAddress){
    this.address = address;
}
}