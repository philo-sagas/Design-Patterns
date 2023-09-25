package com.gof.structural.bridge.example;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    @Override
    protected Implementor getImplementor() {
        return this.implementor;
    }

    @Override
    public void operate() {
        System.out.println("RefinedAbstraction invoke the implementor's specificOperate method.");
        this.implementor.specificOperate();
    }
}
