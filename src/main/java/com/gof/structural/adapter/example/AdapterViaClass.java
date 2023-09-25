package com.gof.structural.adapter.example;

public class AdapterViaClass extends Adaptee implements Target {
    @Override
    public void request() {
        System.out.println("AdapterViaClass invoke Adaptee's specificRequest method.");
        specificRequest();
    }
}
