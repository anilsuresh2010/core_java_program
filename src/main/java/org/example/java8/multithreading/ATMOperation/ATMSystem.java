package org.example.java8.multithreading.ATMOperation;

import javax.swing.*;

public class ATMSystem {
    public static void main(String[] args) {
        Account account = new Account();
        Runnable user1 = ()->{
            String thread = Thread.currentThread().getName();
            account.withdraw(500,thread);
            account.deposit(1000,thread);
            account.checkBalance(thread);
        };
        Runnable user2 =()-> {
            String thread = Thread.currentThread().getName();
            account.deposit(2000,thread);
            account.withdraw(400,thread);
            account.checkBalance(thread);
        };
        Runnable user3 = ()->{
          String thread = Thread.currentThread().getName();
          account.checkBalance(thread);
          account.withdraw(700,thread);
          account.deposit(5000, thread);
        };

        Thread t1 = new Thread(user1,"Thread1 ");
        Thread t2 = new Thread(user2,"Thread2");
        Thread t3 = new Thread(user3,"Thread3");
        t1.start();
        t2.start();
        t3.start();

    }
}
