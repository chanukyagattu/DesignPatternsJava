package com.java.demo.behavioural.chainOfResponsibility.solution;

public class QuickbooksHandler extends Handler {
    public QuickbooksHandler(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String fileType) {
        System.out.println("Reading data from a QuickBooks file.");
        return fileType.endsWith(".qbw");
    }
}
