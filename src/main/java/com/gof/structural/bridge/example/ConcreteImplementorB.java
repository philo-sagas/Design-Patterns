package com.gof.structural.bridge.example;

public class ConcreteImplementorB implements Implementor {
    @Override
    public void specificOperate() {
        System.out.println("ConcreteImplementorB's specificOperate method is called.");
    }
}
