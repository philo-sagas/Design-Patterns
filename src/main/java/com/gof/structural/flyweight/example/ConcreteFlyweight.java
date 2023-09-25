package com.gof.structural.flyweight.example;

public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operate(String extrinsicState) {
        System.out.printf("ConcreteFlyweight's operate method is called with one intrinsicState: '%s' and one extrinsicState: '%s'.\n", this.intrinsicState, extrinsicState);
    }
}
