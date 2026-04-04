package com.java.demo.behavioural.visitor.solution;

public class NormalizeOperation implements SegmentOperations {

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Normalizing fact segment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Normalizing format segment");
    }
}
