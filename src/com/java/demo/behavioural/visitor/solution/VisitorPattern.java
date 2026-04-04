package com.java.demo.behavioural.visitor.solution;

import java.util.ArrayList;
import java.util.List;

// Visitor Pattern Implementation: Separates operations from object structures.
// Objects (SegmentNode) accept visitors (SegmentOperations) to perform operations.

public class VisitorPattern {
    public static void main(String[] args) {
        List<SegmentNode> segmentNodes = new ArrayList<>();
        segmentNodes.add(new FormatSegment() {
        });
        segmentNodes.add(new FactSegment() {
        });
        execute(new AddReverbOperation(), segmentNodes);
    }

    static void execute(SegmentOperations segmentOperations, List<SegmentNode> segmentNodes) {
        for (var segmentNode : segmentNodes)
            segmentNode.accept(segmentOperations);
    }
}
