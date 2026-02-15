package org.example.java8.multithreading.executerExamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class NewFixedThreadPoolExample {
    public static void processiong(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        ExecutorService executorService =Executors.newFixedThreadPool(5);
        Runnable task =()->{
            System.out.println("Start request "+Thread.currentThread().getName());
              processiong();
            System.out.println("End request "+ Thread.currentThread().getName());
        };
        for(int i=0; i<10;i++){
            int taskId = i;
            System.out.println("Thread "+Thread.currentThread().getName()+taskId);
            executorService.execute(task);
        }
        executorService.shutdown();
    }

}
