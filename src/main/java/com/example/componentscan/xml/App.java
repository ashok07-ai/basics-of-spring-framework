package com.example.componentscan.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        // Initialize the Spring application context using an XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("componentScan.xml");

        // Retrieve the Employee bean from the Spring context
        Employee employee = context.getBean("employee", Employee.class);

        // Display the details of the Employee bean
        System.out.println(employee.toString());
    }
}
