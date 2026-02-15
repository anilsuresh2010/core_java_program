package org.example.java8.EmployeeClassQuestion;

import java.util.Arrays;
import java.util.List;

public class EmployeeService {
    public static List<Employee> getEmployee(){
        return Arrays.asList(
                new Employee("Anil",12,"Software Engineer","Male",Arrays.asList("java","microservice","SpringBoot")),
        new Employee("Anjali", 3, "Software Engineer", "Female", Arrays.asList("Java", "Spring Boot")),
                new Employee("Ravi", 5, "Senior Developer", "Male", Arrays.asList("Java", "Microservices", "Docker")),
                new Employee("Sneha", 2, "Backend Developer", "Female", Arrays.asList("Node.js", "MongoDB")),
                new Employee("Karan", 6, "Tech Lead", "Male", Arrays.asList("Java", "Spring", "Kubernetes")),
                new Employee("Divya", 4, "QA Engineer", "Female", Arrays.asList("Selenium", "Java", "TestNG")),
                new Employee("Divya", 5, "Developer", "Female", Arrays.asList("Selenium", "Java", "TestNG")),
                new Employee("Amit", 7, "DevOps Engineer", "Male", Arrays.asList("Jenkins", "Docker", "AWS")),
                new Employee("Pooja", 1, "Intern", "Female", Arrays.asList("HTML", "CSS", "JavaScript")),
                new Employee("Manoj", 3, "Full Stack Developer", "Male", Arrays.asList("React", "Spring Boot", "MySQL")),
                new Employee("Nikita", 2, "UI Designer", "Female", Arrays.asList("Figma", "Adobe XD"))

        );
    }
}
