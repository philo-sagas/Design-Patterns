package com.gof.behavioral.visitor.example;

public class ConcreteElementB implements Element {
    private String data;

    public ConcreteElementB(String data) {
        this.data = data;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public String operateB() {
        System.out.printf("ConcreteElementB's operateB method is called with one data: '%s'.\n", this.data);
        return this.data;
    }
}
