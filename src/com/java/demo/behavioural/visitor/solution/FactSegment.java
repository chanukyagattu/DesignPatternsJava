package com.java.demo.behavioural.visitor.solution;

public class FactSegment implements SegmentNode {

    @Override
    public void accept(SegmentOperations segmentOperations) {
        segmentOperations.apply(this);
    }

}
