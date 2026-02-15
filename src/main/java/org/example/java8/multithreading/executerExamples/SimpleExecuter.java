package org.example.java8.multithreading.executerExamples;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExecuter {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i= 0;i<5;i++){
          int  taskId = i;
          service.submit(()->{
                System.out.println("Current thread name :" + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.interrupted();
                }
            });
        }
        service.shutdown();
    }
}
