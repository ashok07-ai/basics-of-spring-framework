package com.example.componentscan.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for Spring's annotation-based configuration.
 * This class serves as an alternative to XML-based configuration.
 */
@Configuration // Marks this class as a configuration class for the Spring application context.
@ComponentScan(basePackages = "com.example.componentscan.annotation")
// Enables component scanning for the specified package to detect Spring-managed components.
public class AppConfig {
}
