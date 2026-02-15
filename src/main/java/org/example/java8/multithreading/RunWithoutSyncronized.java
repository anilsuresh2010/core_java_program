package org.example.java8.multithreading;

public class RunWithoutSyncronized {

    synchronized void  sharedResouce(String t){
        for(int i=0;i<=15;i++){
            System.out.println(t+" "+i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        RunWithoutSyncronized obj = new RunWithoutSyncronized();
        Runnable task = ()->obj.sharedResouce(Thread.currentThread().getName());
        Thread t1= new Thread(task,"Thread1");
        Thread t2 = new Thread(task,"Thread2");
        Thread t3 = new Thread(task,"Thread3");
         t1.start();
         t1.join();
         t2.start();
         t2.join();
         t3.start();

    }
}
