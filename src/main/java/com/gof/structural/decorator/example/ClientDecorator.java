package com.gof.structural.decorator.example;

public class ClientDecorator {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecoratorA(component);
        component = new ConcreteDecoratorB(component);
        component.operate();
    }
}
