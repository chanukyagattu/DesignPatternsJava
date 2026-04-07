package com.java.demo.behavioural.chainOfResponsibility.solution;

public abstract class Handler {

    protected Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(String fileType) {
        if (doHandle(fileType)) {
            return;
        }

        if (next != null) {
            next.handle(fileType);
        } else {
            throw new UnsupportedOperationException("File type not supported: " + fileType);
        }
    }

    public abstract boolean doHandle(String fileType);

}
