package com.lesson2;

/*
    public
    protected
    - default "package locale"
    private
 */
public class Human {
    private String name;
    private int age;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 120;
    private static final int MIN_NAME_LENGHT = 3;
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if (newAge> MIN_AGE && newAge< MAX_AGE) {
            age = newAge;
        } else {
            System.out.println("Неправильно задан возраст");
        }
    }
    public String getName(){
        return name;
    }

    public void setName(String newName){
        if (newName!=null && newName.length()> MIN_NAME_LENGHT) {
            name = newName;
        }
    }
    public  void sayHello(){
        System.out.println("Hi!");
    }




}

