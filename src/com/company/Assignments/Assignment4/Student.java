package com.company.Assignments.Assignment4;

import java.util.Arrays;

public class Student extends Person {
    private int numCourse;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address, int numCourse, String[] courses, int[] grades) {
        super(name, address);
        this.numCourse = numCourse;
        this.courses = courses;
        this.grades = grades;
    }

    public void addCourseGrade(String course, int grade) {
    }

    public void printGrades() {
    }

    public double getAverageGrade() {
        return 0.0;
    }

    public String toString() {
        return super.toString() + "\nNumber of courses: " + numCourse + "\nCourses: " + Arrays.toString(courses) + "\nGrades: " + Arrays.toString(grades);
    }

}
