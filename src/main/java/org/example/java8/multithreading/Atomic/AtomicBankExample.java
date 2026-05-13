package org.example.java8.multithreading.Atomic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicBankExample {
    public static AtomicInteger counter = new AtomicInteger(1);
    public static int desiCounter = 0;

    public static String processTransaction(String accountNumber, int amount){
        int txnSeq = ++desiCounter;
        return "Account Number "+accountNumber+" Amount "+amount+" Sequence "+counter.getAndIncrement();
    }
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>(3);
        Runnable task1 = () ->{
          String result = processTransaction("ACC001",500);
            System.out.println(Thread.currentThread().getName()+ " Result"+result);
        };

        Runnable task2 =() ->{
          String result =  processTransaction("ACC002",1000);
            System.out.println(Thread.currentThread().getName() +" Result "+result);
        };
        Runnable task3 = ()->{
          String result = processTransaction("ACC003",1500);
            System.out.println(Thread.currentThread().getName() +" Result "+result);
        };
        threads.add(new Thread(task1,"Thread 1"));
        threads.add(new Thread(task2, "Thread 2"));
        threads.add(new Thread(task3,"Thread 3"));
        for(Thread t :threads){
            t.start();
        }
        for (Thread t : threads){
            t.join();
        }
        System.out.println("final counter value :  "+counter);
    }
}
