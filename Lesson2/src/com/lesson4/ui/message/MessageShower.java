package com.lesson4.ui.message;

public abstract class MessageShower {

    private final IOnStringInput onStringInput;

    private final String message;

    public MessageShower(IOnStringInput onStringInput, String message) {
        this.onStringInput = onStringInput;
        this.message = message;
    }

    public abstract void show();

    public String getMessage() {
        return message;
    }

    public IOnStringInput getOnStringInput() {
        return onStringInput;
    }
}
