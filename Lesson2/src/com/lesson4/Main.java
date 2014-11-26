package com.lesson4;

import com.lesson4.ui.message.MessageShower;
import com.lesson4.ui.message.console.NumberMessageShower;
import com.lesson4.ui.message.console.StartMessageShower;

public class Main {

    public static void main(String[] args) {
//        new MessageShower("Hello Java!").showStars();
//        MessageShower messageShower = new StartMessageShower("Hello hello java");
//        messageShower.show();

        StringListener stringListener = new StringListener();
        showMessage(new StartMessageShower("What is your name", new InputNameListener()));
        showMessage(new NumberMessageShower("What is your age", new InputAgeListener()));
//        showMessage(new ConsoleMessageShower("Hello hello java",'!',stringListener));
//       showMessage(new DotMessageShower("What is your age?", stringListener));
    }

    private static void showMessage(MessageShower ms){
        ms.show();
    }

}
