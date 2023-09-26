package com.gof.creational.factory_method.example;

public class ClientFactoryMethod {
    public static void main(String[] args) {
        AbstractCreator creatorA = new ConcreteCreatorA();
        creatorA.operate();
        AbstractCreator creatorB = new ConcreteCreatorB();
        creatorB.operate();
    }
}
