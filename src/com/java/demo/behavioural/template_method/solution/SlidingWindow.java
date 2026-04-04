package com.java.demo.behavioural.template_method.solution;

public class SlidingWindow extends WindowBase {
    @Override
    protected void onClose() {
        System.out.println("Saving the state of the window before closing it");
    }


}
