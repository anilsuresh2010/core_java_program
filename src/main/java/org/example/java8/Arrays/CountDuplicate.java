package org.example.java8.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDuplicate {
    public static void main(String[] args) {
        int [] arr = {3,6,4,8,9,2,4,6,7,3};
        Set<Integer> set = new HashSet<>();
        long value=Arrays.stream(arr).boxed().filter(x->!set.add(x)).count();
        System.out.println(value);
    }
}
