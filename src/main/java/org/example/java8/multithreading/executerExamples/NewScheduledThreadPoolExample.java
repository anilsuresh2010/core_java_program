package org.example.java8.multithreading.executerExamples;

import java.time.LocalTime;
import java.util.concurrent.*;

public class NewScheduledThreadPoolExample {
    public static void processing(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
      ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
      service.scheduleWithFixedDelay(()->{
          System.out.println("Task Executed "+LocalTime.now());
          processing();
      },1,2, TimeUnit.SECONDS);
      try{
            Thread.sleep(1000);
      }catch (InterruptedException e){
          e.printStackTrace();
      }
      service.shutdown();
    }
}
