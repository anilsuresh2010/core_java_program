package org.example.java8.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(5);
        Runnable producer = ()->{
            for(int i=0;i<=5;i++){
                queue.add(i);
                System.out.println("Pushed "+i+" Queue size  "+queue.size());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Runnable consumer = ()->{
          for (int i=0;i<=15;i++){
              try {
                  queue.take();
                  Thread.sleep(500);
                  System.out.println("Consumed "+i+" Queue size : "+queue.size());
              } catch (InterruptedException e) {
                  Thread.currentThread().interrupt();
              }
          }
        };
        Thread t1 = new Thread(producer,"Producer Thread");
       // Thread t2 = new Thread(producer,"Producer Thread");
       // Thread t3 = new Thread(producer,"Producer Thread");
        Thread t4 = new Thread(consumer,"Consumer Thread ");
       // Thread t5 = new Thread(consumer,"Consumer Thread ");
       // Thread t6 = new Thread(consumer,"Consumer Thread ");

        t1.start();
      //  t2.start();
        //t3.start();
        t4.start();
       // t5.start();
       // t6.start();
    }
}
