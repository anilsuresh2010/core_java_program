package org.example.java8.listOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementFromTwoList {
    public static List<String> findCommon(List<String> list1, List<String> list2){
        return list1.stream().filter(list2::contains).distinct().collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("anil","vimal","rama","chandresh");
        List<String> list2 =Arrays.asList("chandresh","Vimal","ram");
        System.out.println("before : "+list1);
       List<String> commonList = CommonElementFromTwoList.findCommon(list1,list2);
        System.out.println(commonList);

    }
}
