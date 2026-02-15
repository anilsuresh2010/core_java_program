package org.example.java8.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FindUnCommonElement {
    public static void main(String[] args) {
        Integer [] arr1 = {2,4,6,8,9};
        Integer [] arr2 = {2,4,6,7,5,1};
        Set<Integer> set1 = Arrays.stream(arr1).collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(arr2).collect(Collectors.toSet());
        Set<Integer> uncommonSet = Arrays.stream(arr1).filter(num -> !set2.contains(num)).collect(Collectors.toSet());
        uncommonSet.addAll(Arrays.stream(arr2).filter(num ->!set1.contains(num)).collect(Collectors.toSet()));
        System.out.println(uncommonSet);
    }
}
