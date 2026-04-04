package com.java.demo.behavioural.template_method.solution;

// Demonstrates Template Method Pattern: Algorithm skeleton defined in abstract class,
// with customizable steps implemented by concrete subclasses

/**
 * Template Method Pattern - Behavioral Pattern
 *
 * Purpose: Defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
 * Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
 *
 * Key Characteristics:
 * - Abstract class defines the template method (algorithm skeleton)
 * - Template method is declared final to prevent overriding
 * - Primitive operations (hooks) are either abstract or default implementations
 * - Subclasses customize behavior by overriding hook methods
 *
 * Real-world Example: Window closing process
 * - All windows follow the same closing sequence: save state → remove from screen → release resources
 * - Different window types (SlidingWindow, RegularWindow) customize specific steps
 * - The overall algorithm structure remains the same
 *
 * Benefits:
 * - Code reuse: Common algorithm structure is shared
 * - Extensibility: New window types can be added without modifying existing code
 * - Inversion of control: Algorithm flow is controlled by the framework, not subclasses
 *
 * DIFFERENCE FROM OTHER PATTERNS:
 * - Strategy Pattern: Client chooses algorithm at runtime (multiple strategies coexist)
 * - State Pattern: Object behavior changes based on internal state (one active state)
 * - Template Method: Algorithm structure is fixed, subclasses customize specific steps
 */

public class TemplateMethodPattern {
    public static void main(String[] args) {
        WindowBase slidingWindow = new SlidingWindow();
        slidingWindow.close();

        System.out.println("-------------");

//        WindowBase dialogWindow = new DialogWindow();
//        dialogWindow.close();
    }
}
