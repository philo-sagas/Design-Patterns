package com.gof.creational.abstract_factory.example;

public class ConcreteFactory2 implements AbstractFactory {
    private static ConcreteFactory2 INSTANCE = new ConcreteFactory2();

    public static ConcreteFactory2 getInstance() {
        return INSTANCE;
    }

    private ConcreteFactory2() {
        // singleton
    }

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
