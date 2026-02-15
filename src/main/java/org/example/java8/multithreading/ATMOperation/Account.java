package org.example.java8.multithreading.ATMOperation;

public class Account {
    int balance = 1000;
    public synchronized void withdraw(int amount, String threadName){
        if(balance>=  amount){
            balance -= amount;
            System.out.println(Thread.currentThread().getName()+" Withdraw amount "+amount+" available balance :"+balance);
        }else{
            System.out.println("Insufficient fund : "+balance);
        }
    }
    public synchronized void deposit(int amount, String threadName){
        balance += amount;
        System.out.println(threadName+ "Deposit amount "+amount+" Available balance : " +balance);

    }
    public synchronized void checkBalance(String threadName){
        System.out.println(threadName+" check balance "+balance);
    }

}
