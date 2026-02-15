package org.example.java8.multithreading.executerExamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCacheThreadPoolExample {
    public static void processing(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        Runnable task =()->{
            System.out.println("Start "+Thread.currentThread().getName());
            processing();
            System.out.println("End "+Thread.currentThread().getName());
        };
        for(int i=0; i<10;i++){
            int taskId = i;
            service.submit(task);
        }
        service.shutdown();

    }
}
