package com.lesson4;

import com.lesson4.ui.message.IOnStringInput;

/**
 * Created by User on 22.11.2014.
 */
public class InputAgeListener implements IOnStringInput {
    @Override
    public void onStringInput(String input) {
        System.out.println("Your age is:" + input);
    }
}
