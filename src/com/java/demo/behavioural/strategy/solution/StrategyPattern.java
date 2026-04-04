package com.java.demo.behavioural.strategy.solution;

/**
 * Strategy Pattern - Behavioral Pattern
 * Strategy = interchangeable algorithms
 *
 * Purpose: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
 * Allows the client to select the algorithm at runtime.
 *
 * KEY DIFFERENCE FROM STATE PATTERN:
 * - STATE PATTERN: Object behavior changes based on internal state. Only ONE state is active at a time.
 *   The state transitions automatically based on internal logic.
 * - STRATEGY PATTERN: Client explicitly chooses which algorithm/strategy to use. MULTIPLE strategies
 *   can coexist, and the client decides which one to apply. No automatic transitions.
 *
 * Example: Encryption can be DES, AES, RSA, etc. Client chooses which encryption strategy to use
 * for a particular operation, independent of other operations.
 */
public class StrategyPattern {
    public static void main(String[] args) {
        var encryptionMechanism = new EncryptionMechanism(new DESEncryption());
        encryptionMechanism.encrypt("Hello World");
    }
}
