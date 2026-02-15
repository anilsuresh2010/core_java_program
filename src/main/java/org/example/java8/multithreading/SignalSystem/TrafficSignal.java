package org.example.java8.multithreading.SignalSystem;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TrafficSignal {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private String currentColor = "RED";

    public void showLight(String color, String nextColor, int duration) {
        while (true) {
            lock.lock();
            try {
                while (!currentColor.equalsIgnoreCase(color)){
                    condition.await();
                }
                int hour = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")).getHour();
                boolean isNight = hour >= 20 || hour<9;
                if(isNight && !color.equalsIgnoreCase("YELLOW")){
                    currentColor ="YELLOW";
                    condition.signalAll();
                    continue;
                }

                System.out.println("Traffic light on with color : " + currentColor);
                Thread.sleep(duration);
                currentColor = nextColor;
                condition.signalAll();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        TrafficSignal signal = new TrafficSignal();
        Runnable redLight = ()->signal.showLight("RED","GREEN",3000);
        Runnable greenLight = ()->signal.showLight("GREEN","YELLOW",2000);
        Runnable yellowLight = ()->signal.showLight("YELLOW","RED",1000);

        Thread t1 = new Thread(redLight,"RED LIGHT");
        Thread t2 = new Thread(greenLight,"GREEN LIGHT");
        Thread t3 = new Thread(yellowLight,"YELLOW LIGHT");

            t1.start();
            t2.start();
            t3.start();
    }
}
