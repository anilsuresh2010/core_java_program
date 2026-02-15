package org.example.java8.listOperation;

import org.example.java8.EmployeeClassQuestion.Employee;
import org.example.java8.EmployeeClassQuestion.EmployeeService;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpMoreThen3YrsExp {
    public static void main(String[] args) {
        List<Employee> emp = EmployeeService.getEmployee().stream().filter(employee -> employee.getExp()>3).sorted(Comparator.comparing(Employee::getName)).toList();
        System.out.println(emp);
    }
}
