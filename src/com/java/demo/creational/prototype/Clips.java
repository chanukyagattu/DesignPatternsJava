package com.java.demo.creational.prototype;

public class Clips implements Component {
    private Timeline timeline;

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    @Override
    public Component duplicate() {
        Clips newClip = new Clips();
        newClip.setTimeline(timeline);
        return newClip;
    }
}
