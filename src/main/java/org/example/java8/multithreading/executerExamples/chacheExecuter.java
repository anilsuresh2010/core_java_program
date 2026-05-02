package org.example.java8.multithreading.executerExamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class chacheExecuter {
    public static void main(String[] args) {
        ExecutorService executer =Executors.newFixedThreadPool(4);
        for (int i = 0;i<20;i++){
            int taskId = i;
            executer.submit(()->{
                System.out.println("Task   "+taskId+ "  is running on :"+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task "+taskId+ " Completed");
            });
        }
        executer.shutdown();
    }
}
