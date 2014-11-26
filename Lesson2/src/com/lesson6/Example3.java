package com.lesson6;

public class Example3 {

    int k = 4;

    Example3(){
        k = -6;
    }

    public void show(int k){
        System.out.println(k);
        k++;
        inc();
    }

    public static void main(String[] args) {
        int k = 10;
        Example3 example3 = new Example3();
        example3.show(k++);
        System.out.println(example3.k);
        System.out.println(k);
    }

    public void inc(){
        k++;
    }


}
