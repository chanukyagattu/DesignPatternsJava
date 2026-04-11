package com.java.demo.creational.factory;

public class SchedulerV2 extends Scheduler {
    @Override
    protected WesternCalendar createCalendar() {
        return new ArabianCalendar();
    }
}
