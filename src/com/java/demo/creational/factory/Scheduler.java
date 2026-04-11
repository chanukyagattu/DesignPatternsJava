package com.java.demo.creational.factory;

import java.util.Date;

public class Scheduler {
    private WesternCalendar calendar = createCalendar();

    protected WesternCalendar createCalendar() {
        return new GregorianCalendar();
    }

    public void schedule(Event event) {
        var today = new Date();
        calendar.addEvent(event, today);
    }
}
