package com.infosysb27.projectH.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infosysb27.projectH.models.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{}