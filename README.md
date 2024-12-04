# Core Concepts of Spring Framework | Java Web Development

## Coupling
Coupling refers to how closely connected different components or systems are.

---

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




