package com.java.demo.behavioural.chainOfResponsibility.solution;

public class ChainOfResponsibilityPattern {

    public static void main(String[] args) {

        ExcelHandler excelHandler = new ExcelHandler(null);
        NumbersHandler numbersHandler = new NumbersHandler(excelHandler);
        QuickbooksHandler quickbooksHandler = new QuickbooksHandler(numbersHandler);
        DataReader dataReader = new DataReader(quickbooksHandler);
        dataReader.read(".qbw");
    }
}
