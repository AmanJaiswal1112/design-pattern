package com.practice.structural.Adaper_Design_pattern;

public class CollageStudent implements Student{
    private int id;
    private String name;
    private int phn;
    private String email;

    public CollageStudent(int id, String name, String email, int phn) {
        this.id = id;
        this.name=name;
        this.email = email;
        this.phn = phn;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public int getPhn() {
        return phn;
    }
}
