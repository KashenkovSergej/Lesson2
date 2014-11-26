package com.hexlet.common;

/**
 * Created by user on 01.10.14.
 */
public class Course {
    public String name = "N/A";
    public int hours = 1;
    public void aboutCourse(){
        System.out.println("My course - " + name);
        System.out.println("Hourse - " + hours);
    };
}
