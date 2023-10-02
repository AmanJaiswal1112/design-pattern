package com.practice.structural.Adaper_Design_pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();
        SchoolStudent schoolStudent = new SchoolStudent(1, "aman", 720);

        CollageStudent collageStudent = new CollageStudent(2, "jaiswal", "aman@gmail.com",1720);


        students.add(collageStudent);
        students.add( new SchoolStudentAdapter(schoolStudent));
        return students;

    }
}
