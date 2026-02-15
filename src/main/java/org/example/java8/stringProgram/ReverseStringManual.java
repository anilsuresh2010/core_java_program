package org.example.java8.stringProgram;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringManual {
    public static void main(String[] args) {
        String str = "hello i am anil";
        String reverse = IntStream.range(0,str.length()).mapToObj(i -> str.charAt(str.length() -1 -i)).map(String::valueOf).collect(Collectors.joining());
        System.out.println(reverse);
    }
}
