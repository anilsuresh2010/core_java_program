package org.example.java8.flatmap;

import org.example.java8.EmployeeClassQuestion.EmployeeService;

public class PrintTechSkillByName {
    public static void main(String[] args) {
        EmployeeService.getEmployee().stream().forEach(emp->{
            String skill = String.join("-",emp.getTechStack());
            System.out.println(emp.getName() +"- " +skill);
        });

    }
}
