package com.gof.behavioral.chain_of_responsibility.example;

public class ConcreteHandlerA extends Handler {
    private boolean state;

    public ConcreteHandlerA() {
        super(null);
        this.state = false;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public void handleRequest() {
        if (this.state) {
            System.out.println("ConcreteHandlerA's handleRequest method is called.");
        } else {
            super.handleRequest();
        }
    }
}
