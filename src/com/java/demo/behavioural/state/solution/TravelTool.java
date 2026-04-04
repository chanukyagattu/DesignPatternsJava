package com.java.demo.behavioural.state.solution;

public class TravelTool {
    private TravelMap travelMap;

    public void getEta() {
        travelMap.getEta();
    }

    public void getDirection() {
        travelMap.getDirection();
    }

    public TravelMap getTravelMap() {
        return travelMap;
    }

    public void setTravelMap(TravelMap travelMap) {
        this.travelMap = travelMap;
    }
}
