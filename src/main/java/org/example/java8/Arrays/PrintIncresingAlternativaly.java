package org.example.java8.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintIncresingAlternativaly {
    public static void main(String[] args) {
        int[] arr ={2,4,6,7,5,1};
        int startNumber = 1;
       int[] mergeArray= IntStream.range(0,arr.length)
                .flatMap(index->(index/2)< arr.length ? (index%2==0 ?IntStream.of(arr[index]):
                        IntStream.of(startNumber + (index/2))):IntStream.empty()).toArray();
       System.out.println(Arrays.toString(mergeArray));
    }
}
