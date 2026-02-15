package org.example.java8.stringProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindVovels {
    public static void main(String[] args) {
        String str = "kajdfklauio";
        List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u');
      List<Character> vovels =str.chars().mapToObj(c -> (char) c).filter(list::contains).distinct().collect(Collectors.toList());
        System.out.println(vovels);
    }
}
