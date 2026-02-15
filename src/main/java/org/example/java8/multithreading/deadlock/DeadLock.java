package org.example.java8.multithreading.deadlock;

public class DeadLock {
    private static final  Object lock1 = new Object();
    private static final Object lock2 = new Object();
    public static void main(String[] args) {

        Runnable task1 = ()->{
            synchronized (lock1){
                System.out.println("Thread1 : Lock1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("Thread2 : Lock2");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Runnable task2 = ()->{
          synchronized (lock2){
              System.out.println("Thread2 : Lock2");
              try {
                  Thread.sleep(500);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
              synchronized (lock1){
                  System.out.println("Thread2 : Lock1");
                  try {
                      Thread.sleep(500);
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }
          }
        };
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
    }

}
