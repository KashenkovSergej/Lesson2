package com.lesson2;


public class ExampleStaticClass {
    public static int staticField;
    public int nonStaticField;
    public void hello(){
        System.out.println("Hello" + nonStaticField);
    }
    public static void hello2(){
        System.out.println("hello2" + staticField);
    }
}
