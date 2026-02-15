package org.example.java8.groupingBy;

import java.util.Arrays;

public class FindNumberCount {
    public static void main(String[] args) {
        int [] arr2 = {2,4,6,7,5,1};
         int value =Arrays.stream(arr2).boxed().skip(1).findFirst().get();
         System.out.println(value);
    }
}
