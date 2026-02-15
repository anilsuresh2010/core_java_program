package org.example.java8.EmployeeClassQuestion;

import java.util.Map;
import java.util.stream.Collectors;

public class CountFemalAndMale {
    public static void main(String[] args) {
        Map<String,Long> map =EmployeeService.getEmployee().stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        map.forEach((k,v)->System.out.println(k+" - "+v));
    }
}
