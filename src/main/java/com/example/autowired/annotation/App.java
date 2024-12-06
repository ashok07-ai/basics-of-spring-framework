package com.example.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The main application class that demonstrates Spring's annotation-based configuration.
 */
public class App {

    public static void main(String[] args) {
        // Initialize the Spring application context using the AppConfig class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Employee bean from the Spring application context
        Employee employee = context.getBean("employee", Employee.class);

        // Print the details of the Employee bean to the console
        System.out.println(employee.toString());

        // Retrieve the Manager bean from the Spring application context
        Manager manager = context.getBean("manager", Manager.class);

        // Print the details of the Manager bean to the console
        System.out.println(manager.toString());
    }
}
