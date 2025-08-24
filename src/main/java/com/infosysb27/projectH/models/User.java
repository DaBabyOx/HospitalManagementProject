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
}
