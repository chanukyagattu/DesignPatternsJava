package com.java.demo.behavioural.chainOfResponsibility.solution;

public class ChainOfResponsibilityPattern {

    public static void main(String[] args) {

        ExcelHandler excelHandler = new ExcelHandler(null);
        NumbersHandler numbersHandler = new NumbersHandler(excelHandler);
        DataReader dataReader = new DataReader(numbersHandler);
        dataReader.read(".xls");
    }
}
