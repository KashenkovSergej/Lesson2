package com.lesson4.ui.message.console;

import com.lesson4.ui.message.IOnStringInput;
import com.lesson4.ui.message.MessageShower;

import java.io.*;

public class ConsoleMessageShower extends MessageShower {

    private final char symbol;


    public ConsoleMessageShower(String message, char symbol, IOnStringInput onStringInput) {
        super(onStringInput, message);
        this.symbol = symbol;
    }

    @Override
    public void show(){
        showLine();
        System.out.println(getMessage());
        showLine();
        inpuString();
    }

    private void inpuString(){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String stringFromUser = bufferedReader.readLine();
            getOnStringInput().onStringInput(stringFromUser);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showLine(){
        for (int i=0; i<getMessage().length(); i++)
            System.out.print(symbol);
        System.out.println();
    }
}
