# Core Concepts of Spring Framework | Java Web Development

## Coupling
Coupling refers to how closely connected different components or systems are.

## Tight Coupling
Tight coupling describes a scenario where software components are **highly dependent** on each other. This can make the code difficult to maintain, test, or modify because changes in one class often require changes in others.

---

## Loose Coupling
Loose coupling describes how a scenario where software components are **less dependent** on each other. This improves **flexibility**, **scalability**, and **maintainability**, as changes in one class have minimal impact on others.

### How to Achieve Loose Coupling:
- Use **interfaces**
- Applying **abstraction**
- Implementing **dependency injection**

---

## Inversion of Control (IOC)
Inversion of Control is a design principle where the control of **object creation** and **lifecycle management** is transferred from the application code to an external container or framework.

### Advantages of IOC
- Loose Coupling
- Testability
- Scalability
- Centralized Configuration

---

## Dependency Injection (DI)
Dependency Injection is a design pattern commonly used in object-oriented programming, where the dependencies of a class are provided externally rather than being created within the class itself.

### Types of Dependency Injection (DI)
- **Constructor Injection**
  - Dependencies are provided to the dependent class through its constructor
  - Dependencies are passed as arguments to the constructor when the dependent class is instantiated
  - Constructor injection ensures that the dependencies are available when the object are created

- **Setter Injection**
  - Dependencies are provided in the setter method on the bean
  - Less complex and easy to implement
  - Highly readable in configurations
  - Suitable for scenarios where beans may require reconfiguration after instantiation

---

## Beans
Objects that are managed by frameworks are known as Beans. These objects are created and configured based on the **metadata** provided by the application (XML, Java annotations, or Java-based configurations).

### The typical lifecycle of Bean involves:
- Instantiation: The container creates the bean instance.
- Dependency Injection: Dependencies are injected into the bean.
- Initialization: If the bean implements InitializingBean or has a method annotated with **@PostConstruct**, initialization logic is executed.
- Usage: The bean is used within the application.
- Destruction: With the application context is closed, beans are destroyed. Custom cleanup methods (e.g., those annotated with **@PreDestroy**) are invoked.
  - For more details, refer to the [Spring Documentation on Bean Initialization.](https://docs.spring.io/spring-framework/reference/core/beans/annotation-config/postconstruct-and-predestroy-annotations.html)

---
## Spring Container
The spring container is the core of the Spring Framework. The container will create the objects, wire them together, configure them, and manage their complete lifecycle from creation till destruction.

### Types of Spring Container
- **BeanFactory Container**
  - The simples container in Spring, designed to be lightweight and used when minimal resource usage is needed.
  - Example: XmlBeanFactory(deprecated) or DefaultListableBeanFactory.
- ApplicationContext Container
  - A more advanced container than BeanFactory, with more features like event propagation, declarative mechanisms and more.
  - Example: ClassPathXmlApplicationContext, AnnotationConfigApplicationContext, GenericWebApplicationContext.
  - ApplicationContext includes everything **BeanFactory** offers, but also adds more functionality. It's the preferred choice for most applications.

---

## Spring Configuration
Spring provides several ways to configure the container and define beans, depending on the style of configuration you prefer (XML-based, annotation-based, or Java-based)
- **XML-Based Configuration**: XML configuration is one of the oldest and widely used methods for setting up Spring beans and the container
- **Annotation-based Configuration**: With the advent of annotations, Spring has moved toward more modern and concise configuration styles. @Component, @Configuration, @Bean, and @Autowired are commonly used annotations in this approach.
- **Java-based Configuration**: Java-based configuration allows you to define beans using Java code, and it can be the most flexible approach. 





