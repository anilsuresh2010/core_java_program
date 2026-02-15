package org.example.java8.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintAllAddress {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("Pune", "Mumbai", "Bangalore"),
                Arrays.asList("Kolkata", "Gwalior", "Indor"),
                Arrays.asList("Gwalior", "Nagpur", "Udaypur", "Jaipur")
        );

        List<String> sortedList = list.stream()
                .flatMap(List::stream)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);

        List<String> address=list.stream().flatMap(List::stream).distinct().toList();

       System.out.println(address);
       System.out.println(sortedList);
    }
}
