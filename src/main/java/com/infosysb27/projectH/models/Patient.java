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
}
