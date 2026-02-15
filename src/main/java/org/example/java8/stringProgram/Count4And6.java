package org.example.java8.stringProgram;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count4And6 {
    public static void main(String[] args) {
        String s = "8377343441669737466";
        Map<Character, Long> map =s.chars().mapToObj(c->(char)c).filter(i->i== '4' || i=='6').collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach((k,v)-> System.out.println(k+" - "+v));
    }
}
