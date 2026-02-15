package org.example.java8.multithreading.executerExamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadOrderwithExecuter {
    public static void main(String[] args) {
        AtomicInteger turn = new AtomicInteger(1);
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i=1;i<=3;i++){
            int threadNum = i;
            executor.submit(()->{
                while(true) {
                    if (threadNum == turn.get()) {
                        System.out.println("Thread " + threadNum + " is running ");
                        turn.incrementAndGet();
                        break;
                    } else {
                        try {
                            System.out.println("Thread is waiting ..");
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

            });

        }
        executor.shutdown();
    }
}
