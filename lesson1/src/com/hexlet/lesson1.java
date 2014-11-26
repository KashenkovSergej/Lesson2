package com.hexlet;

import com.hexlet.buildings.Build;
import com.hexlet.common.Course;
import com.hexlet.humans.Student;
public class lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        String name = "Sergej";
        int myAge = 27;
       // byte myByte = 127;
        double weight;
        weight = 100.7;
        String outString = name+": age " + myAge +", weight: " + weight;
        System.out.println(outString);
        System.out.println(outString);
        boolean old = myAge>10;
        System.out.println(old);


        // <type> <name>
        Student studentMax = new Student();
        studentMax.course = new Course();
        studentMax.sayHello();
        studentMax.name="Sergej";
       // studentMax.sayHello();

        studentMax.sayHello();
        Student studentMin = new Student();
        studentMin.name = "Slava";
        studentMin.sayHello();
        Course courseJava = new Course();
        courseJava.name = "javaclass";
        System.out.println(courseJava.name);


        Student student2 = new Student();
        student2.course = new Course();
        student2.sayHello();
        System.out.println(student2.meas);


        studentMax.course.name = "Java";
        studentMax.sayHello();
    }

}

/*
    byte - 8
    short - 16
    int - 32
    long - 64
 */

/*
13
6
3
1
0
 */

// 1101
/*
com.hexlet.humans.Student
    - name
    - age
    - class
Teacher
    - name
    - age
    - class

com.hexlet.common.Course
    - name
    - hours
 */