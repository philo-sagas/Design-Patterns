package com.gof.behavioral.strategy.example;

public class ClientStrategy {
    public static void main(String[] args) {
        ConcreteStrategyA strategyA = new ConcreteStrategyA();
        ConcreteStrategyB strategyB = new ConcreteStrategyB();
        ConcreteStrategyC strategyC = new ConcreteStrategyC();
        Context context = new Context(strategyA, "Data");
        context.request();
        context.setStrategy(strategyB);
        context.request();
        context.setStrategy(strategyC);
        context.request();
    }
}
