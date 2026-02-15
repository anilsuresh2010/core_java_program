package org.example.java8.multithreading.TicketReservation;

import java.awt.print.Book;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MooviTheater theater = new MooviTheater();
        List<BookingRequest> requests = List.of(
                new BookingRequest("User-A", 2),
                new BookingRequest("User-B", 3),
                new BookingRequest("User-C", 1),
                new BookingRequest("User-D", 4),
                new BookingRequest("User-E", 2),
                new BookingRequest("User-F", 1),
                new BookingRequest("User-G", 2),
                new BookingRequest("User-H", 1)
        );

        for (BookingRequest request : requests){
            new Thread(new BookingTask(request,theater),request.user()).start();
        }

    }
}
