package com.practice.structural.Facade_Design_pattern;

public class ClientCode_FDP {
    public static void main(String[] args) {

        UserBuilder.Builder builder = new UserBuilder.Builder();
        UserBuilder userBuilder = builder
                .id(1)
                .name("Aman")
                .email("Aman@gmail.com")
                .phn(7905142)
                .build();

        User user = new User(userBuilder.id, userBuilder.name, userBuilder.email, userBuilder.phn);
        BookFacade bookFacade = new BookFacade();
        bookFacade.createTicket(user);
    }
}
