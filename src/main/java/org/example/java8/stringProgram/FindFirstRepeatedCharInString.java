package org.example.java8.stringProgram;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharInString {



    public static void main(String[] args) {
        String str = "cabacedba";
        Map<Character, Long> map  =str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new , Collectors.counting()));
        char value=map.entrySet().stream().filter(entry->entry.getValue() >1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(value);

    }
}
