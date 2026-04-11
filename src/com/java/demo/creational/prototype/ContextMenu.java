package com.java.demo.creational.prototype;

public class ContextMenu {
    private final Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
       Component duplicatedComponent = component.duplicate();
        timeline.add(duplicatedComponent);
    }
}
