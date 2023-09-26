package com.gof.creational.factory_method.example;

public class ConcreteCreatorA extends AbstractCreator {
    @Override
    protected AbstractProduct factoryMethod() {
        return new ConcreteProductA();
    }
}
