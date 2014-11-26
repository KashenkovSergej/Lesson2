package com.lesson6;

public class Example11 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 100; i++)
//            sb.append(i + " ");
        String test = "test";
        sb.append(test);

        System.out.println(sb.toString().equals(test));
    }
}
