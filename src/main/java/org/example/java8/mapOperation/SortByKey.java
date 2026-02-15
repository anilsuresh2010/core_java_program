package org.example.java8.mapOperation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 2);
        map.put("Mango", 3);
        map.put("Cherry", 1);
       Map<String,Integer> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
       sorted.forEach((k,v)-> System.out.println(k +"  "+v));
       Map<String,Integer> sortedValue = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
       sortedValue.forEach((k,v)-> System.out.println(k+ "  "+v));
    }
}
