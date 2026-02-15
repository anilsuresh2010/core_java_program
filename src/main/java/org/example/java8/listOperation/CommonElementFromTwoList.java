package org.example.java8.listOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementFromTwoList {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("anil","vimal","rama");
        List<String> list2 =Arrays.asList("chandresh","Vimal","ram");
        List commonList=list1.stream().map(String::toUpperCase)
                .filter(name->list2.stream().map(String::toUpperCase).collect(Collectors.toSet()).contains(name)).toList();
        System.out.println(commonList);
        List<String> set1 =list1.stream().map(String::toUpperCase).filter(name->list2.stream().map(String::toUpperCase).collect(Collectors.toSet()).contains(name)).toList();
        System.out.println(set1);
    }
}
