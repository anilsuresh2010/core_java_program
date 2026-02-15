package org.example.java8.EmployeeClassQuestion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String name;
    private int Exp;
    private String title;
    private String gender;
    private List<String> techStack;

}
