package com.java.demo.creational.prototype;

public class Audio implements Component {
    private Timeline timeline;

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    @Override
    public Component duplicate() {
        Audio newAudio = new Audio();
        newAudio.setTimeline(timeline);
        return newAudio;
    }
}
