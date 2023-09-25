package com.gof.structural.adapter.example;

public class AdapterViaObject implements Target {
    private Adaptee adaptee;

    public AdapterViaObject(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("AdapterViaObject invoke the adaptee's specificRequest method.");
        this.adaptee.specificRequest();
    }
}
