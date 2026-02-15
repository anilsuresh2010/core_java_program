package org.example.java8.flatmap;

import org.example.java8.EmployeeClassQuestion.EmployeeService;

import java.util.List;

public class PrintAllCource {
    public static void main(String[] args) {
        List<String> skills =EmployeeService.getEmployee().stream().flatMap(emp->emp.getTechStack().stream()).toList();
        System.out.println(skills);
    }
}
