package com.prasun.hospital.Service;

import com.prasun.hospital.Entity.Patient;
import com.prasun.hospital.Repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    @Transactional
    public Patient createPatient(Patient patient){
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    public Patient getPatient(Long id){
        return patientRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Patient Not Found"));
    }
}
