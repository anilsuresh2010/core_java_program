package org.example.java8.listOperation;

import org.example.java8.EmployeeClassQuestion.Employee;
import org.example.java8.EmployeeClassQuestion.EmployeeService;

import java.util.Comparator;

public class MinAndMaxExpName {
    public static void main(String[] args) {
        Employee emp =EmployeeService.getEmployee().stream().max(Comparator.comparingInt(Employee::getExp)).orElse(null);
        System.out.println(emp.getName()+" - "+emp.getExp());

        Employee empMin=EmployeeService.getEmployee().stream().min(Comparator.comparingInt(Employee::getExp)).orElse(null);
        System.out.println(empMin.getName()+" - "+empMin.getExp());
    }
}
