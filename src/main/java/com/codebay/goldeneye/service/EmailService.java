package com.codebay.goldeneye.service;

import org.springframework.stereotype.Service;
import com.codebay.goldeneye.model.EmployeeData;

@Service 
public class EmailService {

    // Método para generar la dirección de correo electrónico basada en los datos del empleado
    public String generateEmail(EmployeeData employeeData) {
        // Filtrar y formatear los datos del empleado
        String firstName = filterString(employeeData.getFirstName());
        String lastName = filterString(employeeData.getLastName());
        String firstInitial = firstName.substring(0, 1).toUpperCase();
        String surname = lastName.toLowerCase();
        String department = employeeData.getDepartment().toLowerCase();
        String officeLocation = employeeData.getOfficeLocation().toLowerCase();

        return createEmailAddress(firstInitial, surname, department, officeLocation);
    }
    
    // Método privado para filtrar caracteres no deseados en los nombres
    private String filterString(String input) {
        return input.replaceAll("[^a-zA-Z]", "");
    }
    
    // Método privado para crear la dirección de correo electrónico
    private String createEmailAddress(String firstInitial, String surname, String department, String officeLocation) {
        return firstInitial + surname + "." + department + "@" + officeLocation + ".goldeneye.com";
    }
}
