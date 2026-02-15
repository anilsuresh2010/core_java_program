package org.example.java8.stringProgram;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagram {
    public static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        return s1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .equals(
                        s2.chars()
                                .mapToObj(c -> (char) c)
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                );

    }
    public static void main(String[] args) {
    if(Anagram.checkAnagram("anil","niala")){
        System.out.println("yes");
    }else{
        System.out.println("False");
    }
    }
}
