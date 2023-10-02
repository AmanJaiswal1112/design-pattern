package com.practice.structural.Adaper_Design_pattern;

public class SchoolStudentAdapter implements Student {

    private SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public int getId() {
        return this.schoolStudent.getId();
    }

    @Override
    public String getName() {
        return this.schoolStudent.getName();
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public int getPhn() {
        return this.schoolStudent.getPhn();
    }
}
