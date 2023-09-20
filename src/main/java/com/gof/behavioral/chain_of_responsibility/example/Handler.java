package com.gof.behavioral.chain_of_responsibility.example;

public abstract class Handler {
    private Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest() {
        if (this.successor != null) {
            this.successor.handleRequest();
        }
    }
}
