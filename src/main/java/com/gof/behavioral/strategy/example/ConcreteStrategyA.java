package com.gof.behavioral.strategy.example;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void handle(String data) {
        System.out.println("ConcreteStrategyA's handle method is called.");
    }
}
