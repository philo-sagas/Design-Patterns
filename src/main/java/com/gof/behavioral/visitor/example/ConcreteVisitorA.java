package com.gof.behavioral.visitor.example;

public class ConcreteVisitorA implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("ConcreteVisitorA invoke the concreteElementA's operateA method.");
        concreteElementA.operateA();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("ConcreteVisitorA invoke the concreteElementB's operateB method.");
        concreteElementB.operateB();
    }
}
