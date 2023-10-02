package com.practice.creational.Factory_Design_Pattern;

public class ClientCode_FDP {
    public static void main(String args[]){

        Course hldCourse = CourseFactoy.getCourse("HLD");
        Course lldCourse = CourseFactoy.getCourse("LLD");

        System.out.println(hldCourse.modules);
        System.out.println(lldCourse.modules);
    }
}
