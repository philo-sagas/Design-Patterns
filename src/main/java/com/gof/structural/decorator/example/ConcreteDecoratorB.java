package com.gof.structural.decorator.example;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        super.operate();
        this.behaveB();
    }

    private void behaveB() {
        System.out.println("ConcreteDecoratorB's behaveB method is called.");
    }
}
