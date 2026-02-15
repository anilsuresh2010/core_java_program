package org.example.java8.EmployeeClassQuestion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgEmpWhoMoreThen3YearExp {
    public static void main(String[] args) {
      Map<String,Double> exp = EmployeeService.getEmployee().stream().filter(employee -> employee.getExp()>3).collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getExp)));
      exp.forEach((k,v)-> System.out.println(k+ " "+v));
    }
}
