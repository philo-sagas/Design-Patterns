package com.gof.behavioral.strategy.example;

public class ConcreteStrategyC implements Strategy {
    @Override
    public void handle(String data) {
        System.out.println("ConcreteStrategyC's handle method is called.");
    }
}
