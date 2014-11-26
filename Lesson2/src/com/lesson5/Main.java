package com.lesson5;


import com.lesson5.exceptions.IllegalHumanNameException;
import com.lesson5.exceptions.IllegalMoneyException;

import java.util.Iterator;

public class Main {

    private static int[] integers ={1, 2, 5};

    public static void main(String[] args) {
//        Human human = new Human("Max", 1000);
//        Account deposite = null;
//        deposite = human.getNewAccount();
//        Account pension = human.getNewAccount();
//        System.out.println(human.getName()+" money: " + human.getMoney());
//        deposite.changeSum(10);
//        System.out.println(human.getName()+" money: " + human.getMoney());
//        pension.changeSum(5);
//        System.out.println(human.getName()+" money: " + human.getMoney());

//        Building building = new Building();
//        Human max = new Human("Max");
//        Human sergej = new Human("Sergej");
//        building.addHuman(max);
//        building.addHuman(sergej);

//      EXCEPTION ИСКЛЮЧЕНИЯ
        String name = "Max";
        int money = 14;
        //...
        name = null;
        money -= 200;
        //...
//        try {
//            Human i1 = Human.createInstance(name);
//            System.out.println(" Human name " + i1.getName());
//        } catch (IllegalHumanNameException e){
//            System.out.println("NAME ERROR! "+ e.getMessage());
//        } catch (NullPointerException e){
//            System.out.println("ERROR!");
//        }

        try {
            name = "Max";
            Human i1 = Human.createInstance(name, -12);
            System.out.println(" Human name " + i1.getName());
        } catch (IllegalHumanNameException | IllegalMoneyException e) {
            System.out.println("Human creation ERROR!");
        } finally {
            System.out.println("FINALLY");
        }

        try {
            name = "Max";
            Human i1 = Human.createInstance(name, 12);
            System.out.println(" Human name " + i1.getName());
        } catch (IllegalHumanNameException | IllegalMoneyException e) {
            System.out.println("Human creation ERROR!");
        } finally {
            System.out.println("FINALLY");
        }

        try {
            name = null;
            name.length();
            Human i1 = Human.createInstance(name, -12);
            System.out.println(" Human name " + i1.getName());
        } catch (IllegalHumanNameException | IllegalMoneyException e) {
            System.out.println("Human creation ERROR!");
        } finally {
            System.out.println("FINALLY");
        }


//        } catch (IllegalMoneyException e){
//            System.out.println("Illegal money ");
//        }

//        for (int i=0; i<building.getSize(); i++){
//            System.out.println("in building: " + building.get(i));
//        }

//        for (Human human : building){
//            System.out.println("in building: " + human);
//        }

//        Iterator<Human> iterator = building.iterator();
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


//        for (int element : integers){
//            System.out.println(element);
//        }

    }

}
