package com.java.demo.behavioural.strategy.solution;

public class EncryptionMechanism {
    private EncryptionTool encryptionTool;

    public EncryptionMechanism(EncryptionTool encryptionTool) {
        this.encryptionTool = encryptionTool;
    }

    public void encrypt(String ecryptionAlgorithm) {
        encryptionTool.encrypt(ecryptionAlgorithm);
    }

}
