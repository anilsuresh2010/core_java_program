package org.example.java8.listOperation;

import org.example.java8.EmployeeClassQuestion.Employee;
import org.example.java8.EmployeeClassQuestion.EmployeeService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortbyExpThenName {
    public static void main(String[] args) {
        List<Employee> naem  =EmployeeService.getEmployee().stream().sorted(Comparator.comparing(Employee::getExp).thenComparing(Employee::getName)).toList();
        System.out.println(naem);
    }
}
