package org.example.java8.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountcharInArray {
    public static void main(String[] args) {
        int [] arr2 = {2,4,6,7,5,1,4,6,7,6,8,8};
        List<Integer> list = Arrays.stream(arr2).boxed().toList();
        Map<Integer,Long> map =list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach((k,v) -> System.out.println("Key "+k+" value "+v));
    }
}
