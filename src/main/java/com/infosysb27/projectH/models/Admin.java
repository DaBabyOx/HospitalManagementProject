package com.infosysb27.projectH.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin {
    @Id
    private Long idAdmin;

    @OneToOne
    @MapsId
    @JoinColumn(name = "idPatient")
    private User user;
    private String department;
    private String role;

public Long getIdAdmin(){
    return idAdmin;
}

public void setIdAdmin(Long newIdAdmin){
    this.idAdmin = newIdAdmin;
}

public User getUser(){
    return user;
}

public void setUser(User newUser){
    this.user = newUser;
}

public String getDepartment(){
    return department;
}

public void setDepartment(String newDepartment){
    this.department = newDepartment;
}

public String getRole(){
    return role;
}

public void setRole(String newRole){
    this.role = newRole;
}
}

