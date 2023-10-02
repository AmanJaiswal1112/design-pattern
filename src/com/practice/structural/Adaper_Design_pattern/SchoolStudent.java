package com.practice.structural.Adaper_Design_pattern;

public class SchoolStudent {
    private int id;
    private String name;
    private int phn;


    public SchoolStudent(int id, String name,  int phn) {
        this.id = id;
        this.name= name;
        this.phn = phn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhn() {
        return phn;
    }

    public void setPhn(int phn) {
        this.phn = phn;
    }

}
