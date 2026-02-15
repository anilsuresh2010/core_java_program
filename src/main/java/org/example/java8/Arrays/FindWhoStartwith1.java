package org.example.java8.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindWhoStartwith1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 50, 60, 70, 30};
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        List<String> listStart1 = list.stream().map(String::valueOf).filter(x -> x.startsWith("1")).toList();
        System.out.println(listStart1);
    }
}
