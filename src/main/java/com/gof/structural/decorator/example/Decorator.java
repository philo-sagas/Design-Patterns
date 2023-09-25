package com.gof.structural.decorator.example;

public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        System.out.printf("Decorator invoke the component's operate method via %s.\n", this.getClass().getSimpleName());
        this.component.operate();
    }
}
