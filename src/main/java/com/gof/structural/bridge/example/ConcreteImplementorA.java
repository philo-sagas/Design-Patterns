package com.gof.structural.bridge.example;

public class ConcreteImplementorA implements Implementor {
    @Override
    public void specificOperate() {
        System.out.println("ConcreteImplementorA's specificOperate method is called.");
    }
}
