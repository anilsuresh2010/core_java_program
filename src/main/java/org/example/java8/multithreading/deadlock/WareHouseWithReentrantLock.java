package org.example.java8.multithreading.deadlock;

import lombok.Getter;

import java.util.concurrent.locks.ReentrantLock;

public class WareHouseWithReentrantLock {
    @Getter
    static class WareHouse{
        private final String name;
        private  int stock;
        private ReentrantLock lock = new ReentrantLock();

        public WareHouse(String name, int stock){
            this.name = name;
            this.stock = stock;
        }

        public void addStock(int amount){
            stock += amount;
        }
        public void removeStock(int amount){
            stock -= amount;
        }

    }
    
    public static void main(String[] args) {

    }
}
