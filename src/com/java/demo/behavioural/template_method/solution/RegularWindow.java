package com.java.demo.behavioural.template_method.solution;

public class RegularWindow extends WindowBase {
     @Override
    protected void afterClose() {
        System.out.println("Releasing the resources used by the window");
    }

    @Override
    protected void onClose() {
        System.out.println("Saving the state of the window before closing it");
    }
}
