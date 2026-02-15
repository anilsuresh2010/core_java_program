package org.example.java8.EmployeeClassQuestion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpListAsPerExp {
    public static void main(String[] args) {
       Map<Integer, List<String>> map= EmployeeService.getEmployee().stream().collect(Collectors.groupingBy(Employee::getExp,
                Collectors.mapping(Employee::getName,Collectors.toList())));
       map.forEach((k,v)->System.out.println(k+" "+v));
    }
}
