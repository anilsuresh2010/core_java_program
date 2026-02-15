package org.example.java8.EmployeeClassQuestion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmpWhoAreSE {
    public static void main(String[] args) {
       List<Employee> emp = EmployeeService.getEmployee().stream()
                .filter(employee -> employee.getTitle().equalsIgnoreCase("Software Engineer")).collect(Collectors.toList());
       emp.forEach(employee -> System.out.println(employee.getName()));
    }
}
