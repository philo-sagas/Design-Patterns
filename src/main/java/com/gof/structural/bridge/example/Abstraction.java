package com.gof.structural.bridge.example;

public abstract class Abstraction {
    protected Implementor implementor;

    protected abstract Implementor getImplementor();

    public abstract void operate();
}
