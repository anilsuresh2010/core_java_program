package org.example.java8.multithreading.deadlock;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WareHouse {
    private String name;
    private int stock;

    public void addStock(int amount){
        System.out.println("Adding stock "+amount);
        stock += amount;
    }

    public void removeStock(int amount){
        System.out.println("removing stock "+amount);
        stock -= amount;
    }

}
