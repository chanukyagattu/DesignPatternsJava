package com.java.demo.behavioural.template_method.solution;

public abstract class WindowBase {

    // Template Method
    public final void close() {
        onClose(); // hook (before)

         System.out.println("Removing the window from the screen");

        afterClose(); // hook (after)

    }

    protected void onClose() {
    }

    protected void afterClose() {
    }


}
