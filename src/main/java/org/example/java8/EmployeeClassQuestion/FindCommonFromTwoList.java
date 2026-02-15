package org.example.java8.EmployeeClassQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class FindCommonFromTwoList {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("anil", "vimal", "chandresh", "Rama", "Ram","Ram" ,"mahak");
        List<String> list2 = Arrays.asList("anil", "Vimal", "Suresh", "Sameer", "Ram", "Inder", "Ram");
        Set<String> set =list2.stream().map(String::toUpperCase).collect(Collectors.toSet());
        List<String> common = list1.stream().map(String::toUpperCase).filter(set::contains).distinct().collect(Collectors.toList());
        System.out.println(common);
        //Find uncommon element
        List<String> commonList = new ArrayList<>(list1);
        commonList.addAll(list2);
        System.out.println(commonList.size());
        List<String> setuncommon =  commonList.stream().filter(name->!(list1.contains(name) && (list2.contains(name)))).collect(Collectors.toList());
        System.out.println(setuncommon);

    }
}
