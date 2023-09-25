package com.gof.structural.facade.example;

public class ConcreteSubsystemClassB {
    private ConcreteSubsystemClassA subsystemClassA;

    public ConcreteSubsystemClassB(ConcreteSubsystemClassA subsystemClassA) {
        this.subsystemClassA = subsystemClassA;
    }

    public void specificOperate() {
        System.out.println("ConcreteSubsystemClassB invoke the subsystemClassA's specificOperate method.");
        this.subsystemClassA.specificOperate();
    }
}
