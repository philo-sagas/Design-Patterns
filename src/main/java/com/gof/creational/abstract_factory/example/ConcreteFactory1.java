package com.gof.creational.abstract_factory.example;

public class ConcreteFactory1 implements AbstractFactory {
    private static ConcreteFactory1 INSTANCE = new ConcreteFactory1();

    public static ConcreteFactory1 getInstance() {
        return INSTANCE;
    }

    private ConcreteFactory1() {
        // singleton
    }

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
