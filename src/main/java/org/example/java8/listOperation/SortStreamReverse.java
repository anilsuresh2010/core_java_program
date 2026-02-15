package org.example.java8.listOperation;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortStreamReverse {
    public static void main(String[] args) {
        Stream<String> name = Stream.of("vimal","Ram","Anil","chandresh","Rama");
        List<String> set =name.map(String::toUpperCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(set);
    }
}
