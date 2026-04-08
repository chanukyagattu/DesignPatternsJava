package com.java.demo.creational.singleton;

public class Logger {
    private String fileName;

    private static Logger instance = new Logger();

    public static Logger getInstance() {
        return instance;
    }

    private Logger() {}

    public Logger(String fileName) {
        this.fileName = fileName;
    }

    public void write(String message) {
        this.fileName = message;
        System.out.println("Writing a message to the log. " + fileName);
    }

    public String getFileName() {
        return fileName;
    }
}
