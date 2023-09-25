package com.gof.structural.composite.example;

public class Leaf implements Component {
    private Component parent;

    @Override
    public void operate() {
        System.out.println("Leaf's operate method is called.");
    }

    @Override
    public Component getParent() {
        return this.parent;
    }

    @Override
    public void setParent(Component parent) {
        this.parent = parent;
    }
}
