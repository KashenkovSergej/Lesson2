package com.lesson6;

public class Example8 {

    public static void main(String[] args) {
        String str = "RED";

        switch (str){
            case "RED":
                System.out.println("RED");
            case "BLUE":
                System.out.println("BLUE");
                break;
            default:
                System.out.println("def");
        }

        str = "blue";

        switch (str){
            case "RED":
                System.out.println("RED");
            case "BLUE":
                System.out.println("BLUE");
                break;
            default:
                System.out.println("def");
        }
    }

}
