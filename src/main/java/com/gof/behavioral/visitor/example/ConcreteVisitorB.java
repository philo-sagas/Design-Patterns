package com.gof.behavioral.visitor.example;

public class ConcreteVisitorB implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("ConcreteVisitorB invoke the concreteElementA's operateA method.");
        concreteElementA.operateA();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("ConcreteVisitorB invoke the concreteElementB's operateB method.");
        concreteElementB.operateB();
    }
}
