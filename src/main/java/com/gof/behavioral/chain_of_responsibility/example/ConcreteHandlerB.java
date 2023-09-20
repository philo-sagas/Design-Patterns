package com.gof.behavioral.chain_of_responsibility.example;

public class ConcreteHandlerB extends Handler {
    private boolean state;

    public ConcreteHandlerB(Handler successor) {
        super(successor);
        this.state = false;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public void handleRequest() {
        if (this.state) {
            System.out.println("ConcreteHandlerB's handleRequest method is called.");
        } else {
            super.handleRequest();
        }
    }
}
