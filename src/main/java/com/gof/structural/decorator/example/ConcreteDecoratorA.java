package com.gof.structural.decorator.example;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        this.behaveA();
        super.operate();
    }

    private void behaveA() {
        System.out.println("ConcreteDecoratorA's behaveA method is called.");
    }
}
