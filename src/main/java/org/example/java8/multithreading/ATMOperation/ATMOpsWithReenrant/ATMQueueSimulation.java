package org.example.java8.multithreading.ATMOperation.ATMOpsWithReenrant;

import java.util.LinkedList;
import java.util.Queue;

public class ATMQueueSimulation {
    public static void main(String[] args) {
        AccountATM account = new AccountATM();
        Queue<Runnable> customerQueue = new LinkedList<>();
        Runnable user1=()->{
            account.withdraw(500,"User1");
            account.deposit(1000,"User1");
            account.checkBalance("User1");
        };
        Runnable user2= ()->{
          account.deposit(1000,"User2");
          account.withdraw(2000,"User2");
          account.checkBalance("User2");
        };
        Runnable user3 = ()->{
          account.checkBalance("User3");
          account.withdraw(100,"User3");
        };
        customerQueue.add(()->account.accessATM("User1",user1));
        customerQueue.add(()->account.accessATM("User2",user2));
        customerQueue.add(()->account.accessATM("User3",user3));
        while (!customerQueue.isEmpty()){
            new Thread(customerQueue.poll()).start();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
