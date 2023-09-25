package com.gof.structural.flyweight.example;

public class UnsharedConcreteFlyweight implements Flyweight {
    private String allState;

    public UnsharedConcreteFlyweight(String allState) {
        this.allState = allState;
    }

    @Override
    public void operate(String extrinsicState) {
        System.out.printf("UnsharedConcreteFlyweight's operate method is called with one allState: '%s' and one extrinsicState: '%s'.\n", this.allState, extrinsicState);
    }
}
