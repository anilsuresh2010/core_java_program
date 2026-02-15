package org.example.java17;

import java.util.Arrays;
import java.util.List;

public class CreateListAndPrint {
    public static void main(String[] args) {
        // Create list in java 17 and this is a immutable list
        List<String> list = List.of("Anil","vimla","rama");
        list.forEach(name -> System.out.println("Hello "+name));

        //create list in java 1.2 but this is fixed size of list we not modify into it but this is not immutable.
        List<String> name = Arrays.asList("Anil","Chand","Gundi");
        System.out.println(name);
        name.forEach(member-> System.out.println("Hello "+member));
    }
}
