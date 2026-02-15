package org.example.java8.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    private  static  int counter = 0;
    private static final int total_count = 10;
    public static void main(String[] args) {

        Runnable task=()->{
            int userId = counter++;
            System.out.println(Thread.currentThread().getName()+" logged in "+userId);
        };
        Thread[] threads = new Thread[total_count];
        for(int i=0; i<total_count;i++){
           threads[i] = new Thread(task," Thread_"+i);
           threads[i].start();
        }
        for(Thread t : threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Total threads "+counter);
    }
}
