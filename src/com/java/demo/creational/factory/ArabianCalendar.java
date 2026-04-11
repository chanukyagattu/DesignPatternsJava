package com.java.demo.creational.factory;

import java.util.Date;

public class ArabianCalendar implements WesternCalendar {
    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Adding an event to the Arabian calendar");
    }
}
