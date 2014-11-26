package com.lesson4.ui.message.console;


import com.lesson4.ui.message.IOnStringInput;
import com.lesson4.ui.message.console.ConsoleMessageShower;

public class StartMessageShower extends ConsoleMessageShower {

    private static final  char SYMBOL = '*';

    public StartMessageShower(String message, IOnStringInput onStringInput) {
        super(message,SYMBOL,onStringInput);
    }



}
