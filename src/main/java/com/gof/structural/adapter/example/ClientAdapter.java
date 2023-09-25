package com.gof.structural.adapter.example;

public class ClientAdapter {
    public static void main(String[] args) {
        System.out.println("--- STAGE: Adapter Via Class ---");
        Target targetViaClass = new AdapterViaClass();
        targetViaClass.request();
        System.out.println("--- STAGE: Adapter Via Object ---");
        Target targetViaObject = new AdapterViaObject(new Adaptee());
        targetViaObject.request();
    }
}
