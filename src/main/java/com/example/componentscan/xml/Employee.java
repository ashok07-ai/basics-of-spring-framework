package com.example.componentscan.xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Represents an Employee entity with properties injected using Spring annotations.
 */
@Component("employee") // Marks this class as a Spring-managed component with a bean name "employee".
public class Employee {

    private int employeeId;

    @Value("Alpha") // Injects the static value "Alpha" into the firstName field.
    private String firstName;

    @Value("${java.home}") // Injects the value of the Java system property "java.home" into the lastName field.
    private String lastName;

    @Value("#{4 * 8}000") // Injects a calculated value (4 * 8 = 32, multiplied by 1000 = 32000) into the salary field.
    private double salary;

    // Getter and Setter methods for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter and Setter methods for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter methods for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter methods for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Overrides the toString method to provide a string representation of the Employee object.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
