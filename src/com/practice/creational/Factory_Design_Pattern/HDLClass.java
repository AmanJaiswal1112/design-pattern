package com.practice.creational.Factory_Design_Pattern;

public class HDLClass extends Course {
    @Override
    public void createCourse() {
        modules.add(new M4());
        modules.add(new M2());
        modules.add(new M5());

    }
}
