package com.java.demo.behavioural.strategy.solution;

public class DESEncryption implements EncryptionTool {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using DES");
        // Implement DES encryption logic here
        System.out.println("Message encrypted using DES: " + message);
    }
}
