package com.lesson5;

import com.lesson5.exceptions.IllegalHumanNameException;
import com.lesson5.exceptions.IllegalMoneyException;

public class Human {

    public static final int MIN_NAME_LENGTH = 2;
    public static final int MIN_MONEY_VALUE = 0;
    public static final int MAX_MONEY_VALUE = Integer.MAX_VALUE / 2;
    private String name;

    private int money;

    public static Human createInstance(String name) throws IllegalHumanNameException{
        if (name == null || name.length() < MIN_NAME_LENGTH){
            throw new IllegalHumanNameException(name);
        }
        return new Human(name);

    }

    public static Human createInstance(String name, int money) throws IllegalHumanNameException, IllegalMoneyException{
        if (name == null || name.length() < MIN_NAME_LENGTH){
            throw new IllegalHumanNameException(name);
        }
        if (money < MIN_MONEY_VALUE || money < MAX_MONEY_VALUE){
            throw new IllegalMoneyException();
        }

        return new Human(name);

    }

    private Human(String name, int money){
        this.name = name;
        this.money = money;
    }

    private Human(String name){
        this(name,0);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }

    public int getMoney() {
        return money;
    }

//    void changeMoney(int delta){
//        this.money+=delta;
//    }

    public Account getNewAccount(){
        return new HumanAccount();
    }

    private class HumanAccount implements Account{

        @Override
        public int getSum() {
            return money;
        }

        @Override
        public void changeSum(int delta) {
            money+=delta;
        }
    }

// inner (static) && nested (non static)

}
