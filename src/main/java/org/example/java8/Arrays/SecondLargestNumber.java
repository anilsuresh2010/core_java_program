package org.example.java8.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {3,5,8,9,2,6,9};
        int value =Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println(value);
    }
}
