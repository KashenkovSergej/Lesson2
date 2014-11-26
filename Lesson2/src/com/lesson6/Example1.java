package com.lesson6;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Example1 {

    private int [][] v = {
            {1,2},
            {3},
            {3,4,6},
    };

    private int[] m2 = {4,5,};

    private int[] m3;

    private int m4[];

    private int[] m5[];

    public static void main(String[] args) {
        int[][] array = new int[2][2];
        int[][] array1 = {{0,1,2},{1,2},};
        System.out.println(Arrays.deepToString(array1));
        System.out.println(array1[0].length);
        System.out.println(array1[0].getClass().isArray());
        System.out.println(new Example1().getClass().isArray());

    }

}
