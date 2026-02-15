package org.example.java8.multithreading;

import java.time.chrono.ThaiBuddhistEra;

public class ThreadRunningSequence {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = ()->{
          String threadName = Thread.currentThread().getName();
          for(int i=0; i<=5;i++){
              System.out.println(threadName+" "+i);
          }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        Thread t3 = new Thread(task,"Thread 3");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();

    }
}
