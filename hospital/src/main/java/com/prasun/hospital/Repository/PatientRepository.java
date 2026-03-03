package com.prasun.hospital.Repository;

import org.springframework.stereotype.Repository;
import com.prasun.hospital.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}