package org.example.java8.listOperation;

import org.example.java8.EmployeeClassQuestion.Employee;
import org.example.java8.EmployeeClassQuestion.EmployeeService;

import java.util.Set;
import java.util.stream.Collectors;

public class PrintAllTechStack {
    public static void main(String[] args) {
        Set<String> techStack = EmployeeService.getEmployee().stream().flatMap(employee -> employee.getTechStack().stream().map(String::toUpperCase)).distinct().collect(Collectors.toSet());
        System.out.println(techStack);
    }
}
