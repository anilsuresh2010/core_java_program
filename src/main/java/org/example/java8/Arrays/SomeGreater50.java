package org.example.java8.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SomeGreater50 {
    public static void main(String[] args) {
        int[] arr ={10,20,30,10,50,60,70,30};
        int sum  =Arrays.stream(arr).filter(x->x>50).sum();
        System.out.println(sum);
       List<Integer> list = Arrays.stream(arr).boxed().toList();
       IntSummaryStatistics sum1 = list.stream().filter(x->x>50).collect(Collectors.summarizingInt(Integer::valueOf));
       System.out.println(sum1);
    }
}
