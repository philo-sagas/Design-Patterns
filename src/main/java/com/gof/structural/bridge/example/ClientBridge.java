package com.gof.structural.bridge.example;

public class ClientBridge {
    public static void main(String[] args) {
        Abstraction abstraction;
        System.out.println("--- STAGE: With ConcreteImplementorA ---");
        abstraction = new RefinedAbstraction(new ConcreteImplementorA());
        abstraction.operate();
        System.out.println("--- STAGE: With ConcreteImplementorB ---");
        abstraction = new RefinedAbstraction(new ConcreteImplementorB());
        abstraction.operate();
    }
}
