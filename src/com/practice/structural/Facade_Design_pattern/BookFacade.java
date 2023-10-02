package com.practice.structural.Facade_Design_pattern;

public class BookFacade {
    public void createTicket(User user) {

        TicketSystem ticketSystem  = new TicketSystem();
        PaymentSystem paymentSystem  = new PaymentSystem();
        NotificationSystem notificationSystem  = new NotificationSystem();

        boolean isBookingPossible  = ticketSystem.validateAvailiity("Movie");
        if(isBookingPossible)
        {
            ticketSystem.createBooking(100, user, "Movie");
            paymentSystem.chargeCard();
            notificationSystem.sendEmail(user, ticketSystem.getTicketNumber());
            notificationSystem.sendSMS(user, ticketSystem.getTicketNumber());
        }

    }
}
