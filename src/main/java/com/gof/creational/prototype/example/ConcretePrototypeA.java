package com.gof.creational.prototype.example;

public class ConcretePrototypeA extends Prototype {
    private String state;

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    Prototype clone(boolean isDeep) {
        ConcretePrototypeA self = new ConcretePrototypeA();
        self.setState(this.state);
        return self;
    }

    @Override
    public String toString() {
        return String.format("ConcretePrototypeA { state = '%s' }", this.state);
    }
}
