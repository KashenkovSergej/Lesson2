package com.lesson3;

/**
 * Created by User on 22.11.2014.
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Max");
        System.out.println(human.getName());
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        Student student = new Student("Sergej");
        System.out.println(student.getName());
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        House house = new House();
        house.setHuman(student);
        System.out.println("Owner name: " + house.getOwnerName());
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        Teacher teacher = new Teacher("Dandy");
        house.setHuman(teacher);
        System.out.println("Owner name: " + house.getOwnerName());

    }
}
