package org.example.java8.EmployeeClassQuestion;

import java.util.Map;
import java.util.stream.Collectors;

public class AverageExpByGender {
    public static void main(String[] args) {
        Map<String, Double> map =EmployeeService.getEmployee().stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getExp)));
        map.forEach((k,v)->System.out.println(k+" - "+v));

    }
}
