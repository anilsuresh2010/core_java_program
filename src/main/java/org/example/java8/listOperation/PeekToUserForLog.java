package org.example.java8.listOperation;

import java.util.List;

public class PeekToUserForLog {
    public static void main(String[] args) {
        List<String> list = List.of("anil","vimal","anita","animesh","ram");
       List<String> listStartWithA= list.stream()
        .peek(name-> System.out.println("Original "+list))
        .filter(s->s.startsWith("a"))
               .peek(name-> System.out.println("start with a :  "+name))
               .map(String::toUpperCase)
               .peek(name-> System.out.println("After upper case "+name))
               .toList();

        System.out.println(listStartWithA);
    }
}
