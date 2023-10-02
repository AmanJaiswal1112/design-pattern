package com.practice.creational.Factory_Design_Pattern;

public class CourseFactoy{
    public static Course getCourse(String courseType) {
       switch(courseType) {
           case "HLD":
               return new HDLClass();
           case "LLD":
               return new LLDClass();
       }
        return null;
    }
}
