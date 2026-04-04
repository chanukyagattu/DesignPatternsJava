package com.java.demo.behavioural.strategy.solution;

public class AESEncryption implements EncryptionTool {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES");
        // Implement AES encryption logic here
        System.out.println("Message encrypted using AES: " + message);
    }
}
