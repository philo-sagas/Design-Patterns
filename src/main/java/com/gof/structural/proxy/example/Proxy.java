package com.gof.structural.proxy.example;

public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("Proxy invoke the realSubject's request method.");
        this.realSubject.request();
    }
}
