package com.prasun.hospital.Controller;

import com.prasun.hospital.Entity.Patient;
import com.prasun.hospital.Service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @PostMapping
    public ResponseEntity<Patient> create(@RequestBody Patient patient){
        return ResponseEntity.ok(patientService.createPatient(patient));
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Patient>> getAll(){
        return ResponseEntity.ok(patientService.getAllPatients());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Patient> getById(@PathVariable Long id){
        return ResponseEntity.ok(patientService.getPatient(id));
    }

}
