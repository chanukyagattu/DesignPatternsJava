package com.java.demo.creational.factory;

public class FactoryPattern {
    public static void main(String[] args) {
        var scheduler = new Scheduler();
        scheduler.schedule(new Event());

        var schedulerV2 = new SchedulerV2();
        schedulerV2.schedule(new Event());
    }
}
