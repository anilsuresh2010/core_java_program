package org.example.java8.Arrays;

import org.example.java8.EmployeeClassQuestion.Employee;
import org.example.java8.EmployeeClassQuestion.EmployeeService;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCountEachName {
    public static void main(String[] args) {
        String[] arr ={"anil","vimal","ram","chandresh","anil","vimal","anil"};
        Map<String,Long> names =Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       // names.forEach((k,v)->System.out.println(k+" "+v));
        Map<String, Long> map = EmployeeService.getEmployee().stream()
                .collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
        map.forEach((k,v)->System.out.println("Names "+k+ " count "+v));
    }
}
