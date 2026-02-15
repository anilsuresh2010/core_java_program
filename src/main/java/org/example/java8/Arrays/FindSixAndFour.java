package org.example.java8.Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSixAndFour {
    public static void main(String[] args) {
        Integer [] arr2 = {2,4,6,7,5,1,4,6,7,6,8,8};
        Map<Integer,Long> map  =Arrays.stream(arr2).filter(number-> number == 4 || number == 6).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
