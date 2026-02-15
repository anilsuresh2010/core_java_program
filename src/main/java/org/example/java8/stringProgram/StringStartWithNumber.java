package org.example.java8.stringProgram;

import java.util.List;

public class StringStartWithNumber {
    public static void main(String[] args) {
        List<String> list = List.of("1banana","2apple","cherry","dates","5mangos");
        list.stream().filter(str->!str.isEmpty() && Character.isDigit(str.charAt(0))).forEach(System.out::println);
    }
}
