package com.lesson3;

public class Human {


    private final String name;

    private       int    age = 0;

    public Human(String name){
        this.name = name;
        System.out.println("In Human");
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
    public void birthDay(){
        age++;
    }

}
