package org.example.java8.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindUnCommonElement {
    public static void main(String[] args) {
        Integer [] arr1 = {2,4,6,8,9};
        Integer [] arr2 = {2,4,6,7,5,1};
          Set<Integer> set1 = Arrays.stream(arr1).collect(Collectors.toSet());
          Set<Integer> set2 = Arrays.stream(arr2).collect(Collectors.toSet());
          Set<Integer> common = new HashSet<>(set1);
            common.retainAll(set2);
            System.out.println(" All element " +common);

          Set<Integer> uncommon = new HashSet<>(set1);
          uncommon.addAll(set2);
        System.out.println(uncommon);
        uncommon.removeAll(common);
        System.out.println(uncommon);





    }
}
