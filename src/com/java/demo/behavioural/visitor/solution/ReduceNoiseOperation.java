package com.java.demo.behavioural.visitor.solution;

public class ReduceNoiseOperation implements SegmentOperations {

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reducing noise in fact segment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reducing noise in format segment");
    }
}
