package org.example.java8.otherIntvQue;

import java.util.stream.IntStream;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int number = 28;
        Boolean isPrime = IntStream.rangeClosed(2,(int)Math.sqrt(number)).noneMatch(n->number%n ==0);
        System.out.println(isPrime ?"Prime number":"Not prime");
    }
}
