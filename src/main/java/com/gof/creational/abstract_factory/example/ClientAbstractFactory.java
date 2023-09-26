package com.gof.creational.abstract_factory.example;

public class ClientAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory factory;
        AbstractProductA productA;
        AbstractProductB productB;
        System.out.println("--- STAGE: With ConcreteFactory1 ---");
        factory = ConcreteFactory1.getInstance();
        productA = factory.createProductA();
        productB = factory.createProductB();
        System.out.printf("The productA's class is %s.\n", productA.getClass().getSimpleName());
        System.out.printf("The productB's class is %s.\n", productB.getClass().getSimpleName());
        System.out.println("--- STAGE: With ConcreteFactory2 ---");
        factory = ConcreteFactory2.getInstance();
        productA = factory.createProductA();
        productB = factory.createProductB();
        System.out.printf("The productA's class is %s.\n", productA.getClass().getSimpleName());
        System.out.printf("The productB's class is %s.\n", productB.getClass().getSimpleName());
    }
}
