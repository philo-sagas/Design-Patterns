package com.gof.structural.proxy.example;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject's request method is called.");
    }
}
