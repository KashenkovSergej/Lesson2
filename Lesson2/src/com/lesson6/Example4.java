package com.lesson6;

public class Example4 {

    public static void main(String[] args) {
        System.out.println(generateInt(100));
    }

    private static int generateInt (int max){
        return (int)(Math.random()* max);
    }

}
