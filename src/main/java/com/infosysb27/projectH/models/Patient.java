package com.infosysb27.projectH.models;

import jakarta.persistence.*;

@Entity
@Table(name =  "Patient")
public class Patient {
    @Id
    private Long idPatient;

    @OneToOne
    @MapsId
    @JoinColumn(name = "idPatient")
    private User user;
    private String phone;
    private String allergy;

public Long getIdPatient(){
    return idPatient;
}

public void setIdPatient(Long newIdPatient){
    this.idPatient = newIdPatient;
}

public User getUser(){
    return user;
}

public void setUser(User newUser){
    this.user = newUser;
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
