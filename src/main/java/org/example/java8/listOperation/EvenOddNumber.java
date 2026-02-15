package org.example.java8.listOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumber {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,16};
        List<Integer> evenOdd =Arrays.stream(arr).filter(a->a%2 == 0 || a%3 == 0).toList();
        System.out.println(evenOdd);
    }
}
