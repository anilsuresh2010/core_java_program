package org.example.practice;

public class ThreadSequence {


    public static void main(String[] args) {

        Runnable task = () ->{
            for(int i =0;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+ " "+i);
            }
        };

        Thread t1 =  new Thread(task,"Thread 1");
        Thread t2 =  new Thread(task,"Thread 2");


        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
