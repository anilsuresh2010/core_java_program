package org.example.java8.Arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;


public class FindCommonFrom2Array {
    public static void main(String[] args) {
        Integer [] arr1 = {2,4,6,8,9};
        Integer [] arr2 = {2,4,6,7,5,1};
        Set<Integer> set  =Arrays.stream(arr1).filter(Arrays.asList(arr2)::contains).collect(Collectors.toSet());
        System.out.println(set);

        int[] a ={2,4,6,8,9};
        int[] b ={2,4,6,7,5,1};

        Set<Integer> set1=Arrays.stream(a).boxed().collect(Collectors.toSet());
        Set<Integer> set2=Arrays.stream(b).boxed().collect(Collectors.toSet());
        set1.retainAll(set2);
        System.out.println(set1);



    }
}
