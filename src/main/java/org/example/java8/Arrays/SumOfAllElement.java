package org.example.java8.Arrays;

import java.util.Arrays;

public class SumOfAllElement {
    public static void main(String[] args) {
        int [] arr2 = {2,4,6,7,5,1,4,6,7,6,8,8};
       int sum = Arrays.stream(arr2).sum();
        System.out.println(sum);
    }
}
