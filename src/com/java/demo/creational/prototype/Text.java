package com.java.demo.creational.prototype;

public class Text implements Component {
    private Timeline timeline;

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    @Override
    public Component duplicate() {
        Text newText = new Text();
        newText.setTimeline(timeline);
        return newText;
    }
}
