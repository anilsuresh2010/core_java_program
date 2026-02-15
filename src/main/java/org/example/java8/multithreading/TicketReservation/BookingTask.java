package org.example.java8.multithreading.TicketReservation;

public class BookingTask implements Runnable{
    private final BookingRequest request;
    private final MooviTheater theater;

    public BookingTask(BookingRequest request, MooviTheater theater){
        this.request = request;
        this.theater=theater;
    }
    @Override
    public void run() {
            theater.bookSeats(request.user(), request.seats());
    }
}
