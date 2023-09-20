package com.gof.behavioral.strategy.example;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void handle(String data) {
        System.out.println("ConcreteStrategyB's handle method is called.");
    }
}
