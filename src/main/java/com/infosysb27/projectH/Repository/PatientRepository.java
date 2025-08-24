package com.infosysb27.projectH.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infosysb27.projectH.models.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{}