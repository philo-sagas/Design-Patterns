package com.gof.structural.facade.example;

public class Facade {
    public void operate() {
        ConcreteSubsystemClassA subsystemClassA = new ConcreteSubsystemClassA();
        ConcreteSubsystemClassB subsystemClassB = new ConcreteSubsystemClassB(subsystemClassA);
        ConcreteSubsystemClassC subsystemClassC = new ConcreteSubsystemClassC();
        subsystemClassB.specificOperate();
        subsystemClassC.specificOperate();
    }
}
