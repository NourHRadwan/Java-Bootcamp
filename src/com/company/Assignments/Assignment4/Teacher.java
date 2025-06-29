package com.company.Assignments.Assignment4;

import java.util.Arrays;

public class Teacher extends Person  {

   private int numCourses;
   private String[] courses;

    public Teacher(String name, String address, int numCourses, String[] courses) {
        super(name, address);
        this.numCourses = numCourses;
        this.courses = courses;
    }


    public int getNumCourses() {
        return numCourses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "numCourses=" + numCourses +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }

    public boolean addCourse(String course) {
        return true;
    }

    public boolean removeCourse(String course) {
        return true;
    }
}
