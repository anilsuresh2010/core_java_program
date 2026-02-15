package org.example.java8.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class FindSumMaxMin {
    public static void main(String[] args) {
        int[] b ={2,4,6,7,5,1};
       int max =  Arrays.stream(b).max().getAsInt();
       int min = Arrays.stream(b).min().getAsInt();
       System.out.println("Max "+max+ " Min  "+min);

       int maxValue =Arrays.stream(b).boxed().max(Comparator.comparing(Function.identity())).get();
        System.out.println(maxValue);
    }
}
