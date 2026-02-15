package org.example.java8.multithreading.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    public static  final AtomicInteger counter = new AtomicInteger(0);
    public static void main(String[] args) {
        Runnable task =()->{
            int before = counter.get();
            int after  = counter.getAndIncrement();
            System.out.println(Thread.currentThread().getName()+ " before "+before+ "  After "+after );
        };
        for(int i=0;i<10;i++){
            new Thread(task).start();
        }


    }
}
