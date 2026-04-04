package com.java.demo.behavioural.state.solution;
/**
 * State Pattern - Behavioral Pattern
 * 
 * Purpose: Allows an object to alter its behavior when its internal state changes.
 * It appears as if the object changed its class.
 * 
 * Open/Closed Principle Application:
 * - OPEN TO EXTENSION: New travel modes (states) can be added by creating new state classes 
 *   (e.g., Driving, Transit, Walking, Bicycling implementations)
 * - CLOSED TO MODIFICATION: The TravelTool class doesn't need modification when adding new states.
 *   Simply implement the TravelMap interface and inject the state.
 */
public class StatePattern {
    public static void main(String[] args) {
        var travelTool = new TravelTool();
        travelTool.setTravelMap(new Bicycling());
        travelTool.getEta();
        travelTool.getDirection();
    }
}
