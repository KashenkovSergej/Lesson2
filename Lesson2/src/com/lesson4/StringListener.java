package com.lesson4;

import com.lesson4.ui.message.IOnStringInput;

public class StringListener implements IOnStringInput {

    @Override
    public void onStringInput(String input) {
        System.out.println("User input: " + input);
    }
}
