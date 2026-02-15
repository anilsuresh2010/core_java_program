package org.example.java8.stringProgram;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachChar {
    public static void main(String[] args) {
        String s = "klagakladfkjaddj";
        Map<Character, Long> map =s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach((k,v)-> System.out.println(k+ " - "+v));

    }
}
