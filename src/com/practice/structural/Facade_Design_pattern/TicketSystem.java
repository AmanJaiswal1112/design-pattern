package com.practice.structural.Facade_Design_pattern;

public class TicketSystem {
    public boolean validateAvailiity(String movie) {
        return true;
    }


    public void createBooking(int ticketNumber, User user, String movie) {
        System.out.println("Ticket created for "+user.getName());
    }

    public int getTicketNumber() {
        return 100;
    }
}
