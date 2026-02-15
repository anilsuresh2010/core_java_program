package org.example.java8.otherIntvQue;

import java.util.stream.LongStream;

public class CalculateFactorial {
    public static int checkFact(int number){
        return Math.toIntExact((number == 0 || number == 1) ? 1 : LongStream.rangeClosed(2, number).reduce(1, (a, b) -> a * b));
    }
    public static void main(String[] args) {
        System.out.println(CalculateFactorial.checkFact(6));

    }
}
