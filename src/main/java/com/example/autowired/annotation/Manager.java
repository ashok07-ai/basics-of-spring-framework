package com.example.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Represents a Manager entity with a dependency on the Employee class.
 * The dependency is injected using Spring's `@Autowired` annotation.
 */
@Component("manager") // Marks this class as a Spring-managed component with the bean name "manager".
public class Manager {

    @Autowired // Automatically injects an instance of Employee by type.
    private Employee employee;

    /*
     * Uncommenting the following constructor will enable constructor-based injection.
     * Constructor-based injection is useful when the dependency is mandatory.
     *
     * @Autowired
     * public Manager(Employee employee) {
     *     this.employee = employee;
     * }
     */

    /**
     * Overrides the `toString` method to provide a human-readable representation
     * of the Manager object, including its associated Employee.
     */
    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
