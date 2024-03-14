package com.codebay.goldeneye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codebay.goldeneye.model.EmployeeData;
import com.codebay.goldeneye.service.EmailService;

@RestController
public class EmailController {

    @Autowired
    private final EmailService emailService; 
    
    // Constructor para la inyección de dependencia
    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    // Método para manejar las solicitudes POST a "/generateEmail"
    @PostMapping("/generateEmail")
    public ResponseEntity<String> generateEmail(@RequestBody EmployeeData employeeData) {
        try {    
            String email = emailService.generateEmail(employeeData);
            return ResponseEntity.ok(email);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error generating email");
        }
    }
}
