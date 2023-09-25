package com.gof.structural.decorator.example;

public class ConcreteComponent implements Component {
    @Override
    public void operate() {
        System.out.println("ConcreteComponent's operate method is called.");
    }
}
