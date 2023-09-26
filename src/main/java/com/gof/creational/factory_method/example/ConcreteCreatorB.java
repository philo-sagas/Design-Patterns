package com.gof.creational.factory_method.example;

public class ConcreteCreatorB extends AbstractCreator {
    @Override
    protected AbstractProduct factoryMethod() {
        return new ConcreteProductB();
    }
}
