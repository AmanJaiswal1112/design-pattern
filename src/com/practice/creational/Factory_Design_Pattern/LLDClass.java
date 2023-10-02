package com.practice.creational.Factory_Design_Pattern;

public class LLDClass extends Course {
    @Override
    public void createCourse() {
        modules.add(new M1());
        modules.add(new M2());
        modules.add(new M3());
    }
}
