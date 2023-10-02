package com.practice.creational.Factory_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {

    List<Module> modules = new ArrayList<Module>();
    public Course(){
        this.createCourse();
    }
    public  abstract void createCourse();
}
