package org.example.java8.listOperation;

import java.util.List;
import java.util.stream.IntStream;

public class FindPrimeNumberFromList {
    public static boolean checkPrime( int num){
        if(num<2){
            return  false;
        }
        return IntStream.range(2, (int) Math.sqrt(num)).noneMatch(i->num%i==0);
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(11,13,12,45);
        list.stream().filter(FindPrimeNumberFromList::checkPrime).forEach(System.out::println);
    }
}
