package org.example.java8.multithreading.deadlock;


public class WareHouseExample{

    static class TransferStock implements Runnable{
        private  final WareHouse frm;
        private  final WareHouse to;
        private final int amount;

        public TransferStock(WareHouse frm, WareHouse to, int amount){
            this.frm = frm;
            this.to = to;
            this.amount = amount;
        }

        public void run(){
            synchronized (frm){
                System.out.println(Thread.currentThread().getName()+" Locked  "+frm.getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (to){
                    System.out.println(Thread.currentThread().getName()+" Locked "+to.getName());
                    frm.removeStock(amount);
                    to.addStock(amount);
                    System.out.println("Transfer :" +amount+ " from "+frm.getName()+ " To "+to.getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        WareHouse whA = new WareHouse("Pune",100);
        WareHouse whB = new WareHouse("Mumbai",50);

        Thread t1 = new Thread(new TransferStock(whA,whB,100),"Thread 1 ");
        Thread t2 = new Thread(new TransferStock(whB,whA,50),"Thread 2");
        t1.start();
        t2.start();

    }


}
