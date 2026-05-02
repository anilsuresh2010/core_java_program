package org.example.java8.Arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindCharFromEachString {
    public static void main(String[] args) {

        List<Integer> evens  = Arrays.asList(2, 4, 6);
        List<Integer> odds   = Arrays.asList(1, 3, 5);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7);

        List<List<Integer>> listOfLists = Arrays.asList(evens, odds, primes);

        List<Integer> collect = listOfLists.stream().flatMap(list -> list.stream()).collect(Collectors.toList());

        System.out.println(collect);
    }
}
