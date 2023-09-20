package com.gof.behavioral.strategy.example;

public class Context {
    private Strategy strategy;

    private String data;

    public Context(Strategy strategy, String data) {
        this.strategy = strategy;
        this.data = data;
    }

    public void request() {
        this.strategy.handle(this.data);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
