package com.codebay.goldeneye.model;

// Clase que representa los datos de un empleado
public class EmployeeData {
    private String firstName; // Nombre del empleado
    private String lastName; // Apellido del empleado
    private String department; // Departamento del empleado
    private String officeLocation; // Ubicación de la oficina del empleado

    public EmployeeData() {
    }

    // Constructor con parámetros para inicializar todos los campos de la clase
    public EmployeeData(String firstname, String lastname, String departament, String officelocation) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.department = departament;
        this.officeLocation = officelocation;
    }

    // Métodos getter y setter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officelocation) {
        this.officeLocation = officelocation;
    }
}
