package org.example.practice;

import java.util.*;
import java.util.stream.Collectors;

public class TestEnumMap {

    public static void main(String[] args) {
        Map<Status, String> map = new EnumMap<>(Status.class);
        map.put(Status.CANCELLED,"cencelled");
        map.put(Status.COMPLETED,"completed");
        map.put(Status.NEW,"new");
        map.put(Status.PENDING,"Pending");

        TreeMap<Status, String> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldvalue, newvalue) -> newvalue, TreeMap::new));
       collect.forEach((k,v)-> System.out.println(" key "+k+ "  value "+v));
    }
        }
