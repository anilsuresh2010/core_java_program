package org.example.java8.multithreading;

public class CreateThreeThread {
    public static void main(String[] args) {
        Runnable task = ()->{
            String threadName = Thread.currentThread().getName();
            for(int i=0;i<=5;i++){
                System.out.println("ThreadName "+threadName+"  "+i);
            }
        };
        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 =  new Thread(task,"Thread 2");
        Thread t3 =  new Thread(task,"Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
