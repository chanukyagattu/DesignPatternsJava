package com.java.demo.behavioural.visitor.solution;

public interface SegmentOperations {

    void apply(FactSegment factSegment);

    void apply(FormatSegment formatSegment);

}
