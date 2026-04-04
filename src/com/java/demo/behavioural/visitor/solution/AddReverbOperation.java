package com.java.demo.behavioural.visitor.solution;

public class AddReverbOperation implements SegmentOperations {

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Adding reverb to fact segment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Adding reverb to format segment");
    }
}
