package org.example.java8.EmployeeClassQuestion;

import java.util.List;
import java.util.stream.Collectors;

public class FindEmployeeWhoHasJavaExp {
    public static void main(String[] args) {
        List<Employee> employees=EmployeeService.getEmployee().stream().filter(employee -> employee.getTechStack().contains("java")).collect(Collectors.toList());
        employees.forEach(employee -> System.out.println(employee.getName()));
        System.out.println("--------------------");
        List<Employee> empAllCase = EmployeeService.getEmployee().stream().filter(employee -> employee.getTechStack().stream().anyMatch(
                        skill->skill.equalsIgnoreCase("java"))).collect(Collectors.toList());
        empAllCase.forEach(employee -> System.out.println(employee.getName()));
    }
}
