package org.example.java8.multithreading.ATMOperation;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TrafficSignal {
    private static final String RED = "RED";
    private static final String GREEN = "GREEN";
    private static final String YELLOW = "YELLOW";

    private String current = RED; // Start with RED

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public void showLight(String color, String next, int duration) {
        while (true) {
            lock.lock();
            try {
                while (!current.equals(color)) {
                    condition.await();
                }

                System.out.println("🔦 " + color + " light ON");
                Thread.sleep(duration); // Simulate light duration
                current = next;
                condition.signalAll(); // Wake up all threads to check whose turn
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        TrafficSignal signal = new TrafficSignal();

        Runnable redLight = () -> signal.showLight(RED, GREEN, 3000);
        Runnable greenLight = () -> signal.showLight(GREEN, YELLOW, 2000);
        Runnable yellowLight = () -> signal.showLight(YELLOW, RED, 1000);

        new Thread(redLight, "Red Thread").start();
        new Thread(greenLight, "Green Thread").start();
        new Thread(yellowLight, "Yellow Thread").start();
    }
}

