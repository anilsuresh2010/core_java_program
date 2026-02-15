package org.example.java8.racecondition;

public class CheckBalance implements  Runnable{
    int balace = 100;
    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Withdrawing money : " + Thread.currentThread().getName());
            if (balace >= 100) {
                balace -= 50;
                System.out.println("Withdraw money :" + balace + " : " + Thread.currentThread().getName());
            } else {
                System.out.println("Withdraw not done :" + balace + " " + Thread.currentThread().getName());
            }
            System.out.println("Withdraw done final balace : " + balace);
        }
    }
    public static void main(String[] args) {
        CheckBalance cb = new CheckBalance();
        Thread ramesh = new Thread(cb,"Ramesh");
        Thread anil = new Thread(cb,"Anil");
        Thread ram = new Thread(cb,"Ram");
        ramesh.start();
        anil.start();
        ram.start();

    }


}
