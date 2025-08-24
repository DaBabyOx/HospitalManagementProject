package com.infosysb27.projectH.DTO;

public class PatientLogInRequest{
private String email;
private String password;

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
}
