package com.gof.creational.prototype.example;

public class ConcretePrototypeB extends Prototype {
    private String state;

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    Prototype clone(boolean isDeep) {
        ConcretePrototypeB self = new ConcretePrototypeB();
        self.setState(this.state);
        return self;
    }

    @Override
    public String toString() {
        return String.format("ConcretePrototypeB { state = '%s' }", this.state);
    }
}
