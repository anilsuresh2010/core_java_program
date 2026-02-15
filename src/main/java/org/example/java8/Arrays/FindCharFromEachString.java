package org.example.java8.Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class FindCharFromEachString {
    public static void main(String[] args) {String[] strArray = {"aabca", "bcdbd", "aaccde", "aauoeed"};
        List<String> collect = Arrays.stream(strArray).collect(Collectors.toList());


        collect.stream().filter(st->st.startsWith("aa")).forEach(s -> {
            List<Character> list = new ArrayList();
            s.chars().mapToObj(ch->(char)ch).forEach(list::add);
            System.out.println(s+" "+s.length());

        });




    }
}
