package org.example.java8.multithreading.TicketReservation;

import java.time.LocalTime;
import java.util.concurrent.locks.ReentrantLock;

public class MooviTheater {
    public int availableSeats = 10;
    ReentrantLock lock = new ReentrantLock(true);

    public void bookSeats(String user, int requestSeats){

        System.out.println("User "+user+" want to book tickets "+requestSeats);
        try{
            lock.lock();
            System.out.println("Booking started time :"+LocalTime.now());
            if(availableSeats>requestSeats){
                availableSeats -=requestSeats;
                Thread.sleep(1000);
                System.out.println("Successfully booking seats"+requestSeats+" for user "+user );
            }else{
                System.out.println("Not sufficient Seat available : "+availableSeats+" Requested seats "+requestSeats);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println("Releasing lock time "+ LocalTime.now());
            lock.unlock();
        }

    }
}
