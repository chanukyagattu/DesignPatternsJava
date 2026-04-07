package com.java.demo.behavioural.chainOfResponsibility.solution;

public class NumbersHandler extends Handler {
    public NumbersHandler(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String fileType) {
        System.out.println("Reading data from an Numbers spreadsheet.");
        return fileType.endsWith(".numbers");
    }
}
