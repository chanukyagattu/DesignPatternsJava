package com.java.demo.behavioural.chainOfResponsibility.solution;

public class ExcelHandler extends Handler {
    public ExcelHandler(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String fileType) {
        System.out.println("Reading data from an Excel spreadsheet.");
        return fileType.endsWith(".xls");
    }
}