package org.example.java8.Arrays;

import java.util.*;
import java.util.stream.IntStream;

public class FirstRepeatNumber {
    public static void main(String[] args) {
            Integer [] arr2 = {2,4,6,7,5,1,4,6,7,6,8,8};
        Set<Integer> set = new HashSet<>();
        Integer value = Arrays.stream(arr2).filter(number->!set.add(number)).findFirst().get();
        System.out.println(value);
    }
}
