package com.java.demo.behavioural.visitor.solution;

public class FormatSegment implements SegmentNode {

    @Override
    public void accept(SegmentOperations segmentOperations) {
        segmentOperations.apply(this);
    }

}
