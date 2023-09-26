package com.gof.creational.factory_method.example;

public abstract class AbstractCreator {
    public void operate() {
        AbstractProduct product = factoryMethod();
        System.out.printf("The product's class is %s.\n", product.getClass().getSimpleName());
    }

    protected abstract AbstractProduct factoryMethod();
}
