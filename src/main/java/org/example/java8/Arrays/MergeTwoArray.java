package org.example.java8.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {
    public static void main(String[] args) {
        int [] arr1 = {2,4,6,8,9};
        int [] arr2 = {2,4,6,7,5,1};
        int[] mergeArray =IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).distinct().toArray();
        System.out.println(Arrays.toString(mergeArray));
    }
}
