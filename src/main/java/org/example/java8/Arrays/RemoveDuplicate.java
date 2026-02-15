package org.example.java8.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int [] arr = {3,6,4,8,9,2,4,6,7,3};
        Set<Integer> set  =Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println(set);
    }
}
