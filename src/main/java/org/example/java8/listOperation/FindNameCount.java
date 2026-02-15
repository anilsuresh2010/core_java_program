package org.example.java8.listOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNameCount {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("anil","vimal","rama","anil","rama","rama");
        Map<String, Long> value =list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        value.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
