package org.example.java8.multithreading.ATMOperation.ATMOpsWithReenrant;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class AccountATM {
    private int balance = 1000;
    private final ReentrantLock lock = new ReentrantLock(true);
    private final Condition atmAvailable = lock.newCondition();

    public  void withdraw(int amount, String threadName){
        System.out.println(threadName+" Withdrawing money...");
        if(amount<= balance){
            balance-=amount;
            System.out.println(threadName+" withdraw amount "+amount+" available balance "+balance);
        }else{
            System.out.println("Not sufficient balance. Available balance "+balance);
        }
    }
    public  void deposit(int amount, String threadName){
        System.out.println(threadName+"Depositing money ");
        balance+=amount;
        System.out.println("After deposit available balance "+balance);
    }
    public void checkBalance(String threadName){
        System.out.println(threadName+" checking balance and available balance"+balance);
    }
    public void accessATM(String threadName, Runnable task){
        System.out.println(threadName+" currently doing operation in ATM ");
        try {
            lock.lock();
            System.out.println(threadName + " ATM using ..");
            task.run();
            atmAvailable.signal();
        }finally {
            lock.unlock();
        }
    }
}
