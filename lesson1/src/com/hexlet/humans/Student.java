package com.hexlet.humans;

import com.hexlet.common.Course;
public class Student {

    //public <type> <name> [= <initial value>]
    public String name = "N/A";
    public int age = 18;
    public char meas;

    public Course course;

    // public void <name>(<values>)
    public void sayHello(){
        System.out.println("Hello");
        System.out.println("My name is - "+name);
        System.out.println("My age is - "+age);
        course.aboutCourse();
    }

}
