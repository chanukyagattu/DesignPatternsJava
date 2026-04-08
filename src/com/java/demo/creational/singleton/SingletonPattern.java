package com.java.demo.creational.singleton;

public class SingletonPattern {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        log1.write("Hello World");

        Logger log2 = Logger.getInstance();
        System.out.println(log2.getFileName());
    }
}
