package com.practice.structural.Facade_Design_pattern;

public class NotificationSystem {
    public void sendEmail(User user, int ticketNumber) {
        System.out.println("Send email to "+user.getName()+" on email "+user.getEmail()+" for ticket no "+ticketNumber);
    }

    public void sendSMS(User user, int ticketNumber) {
        System.out.println("Send SMS to "+user.getName()+" on phn "+user.getPhn()+" for ticket no "+ticketNumber);
    }
}
