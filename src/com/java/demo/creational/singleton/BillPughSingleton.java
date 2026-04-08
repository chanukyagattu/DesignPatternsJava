package com.java.demo.creational.singleton;

public class BillPughSingleton {
    private String name;
    private BillPughSingleton() {}

    // Static inner class (lazy + thread-safe)
    private static class Handler {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return Handler.instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
