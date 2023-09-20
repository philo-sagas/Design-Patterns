package com.gof.behavioral.visitor.example;

public class ConcreteElementA implements Element {
    private String data;

    public ConcreteElementA(String data) {
        this.data = data;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public String operateA() {
        System.out.printf("ConcreteElementA's operateA method is called with one data: '%s'.\n", this.data);
        return this.data;
    }
}
