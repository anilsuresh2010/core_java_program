package org.example.java8.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrayAlternativally {
    public static void main(String[] args) {
        Integer [] arr1 = {2,4,6,8,10,11,12};
        Integer [] arr2 = {3,5,7,9,11,15,45};
        int length = arr1.length+arr2.length;
        int[] mergeArray =IntStream.range(0,length)
                .flatMap(index->IntStream.concat
                                (index<arr1.length ? IntStream.of(arr1[index]):IntStream.empty(),
                                        index<arr2.length ?IntStream.of(arr2[index]):IntStream.empty()
                )).distinct().toArray();

     System.out.println(Arrays.toString(mergeArray));

    }
}
