package com.practice.structural.Adaper_Design_pattern;

import java.util.List;

public class ClientCode_ADP {
    public static void main(String[] args) {
        StudentClient studentClient = new StudentClient();
        List<Student> studentList = studentClient.getStudents();
        System.out.println(studentList);
    }
}
