package com.java.demo.creational.prototype;

public class PrototypePattern {
    public static void main(String[] args) {
        // prototypes
        ContextMenu contextMenu = new ContextMenu(new Timeline());
        contextMenu.duplicate(new Audio());
        contextMenu.duplicate(new Text());
        contextMenu.duplicate(new Clips());
    }
}
