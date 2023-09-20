package com.gof.behavioral.visitor.example;

public interface Visitor {
    void visitConcreteElementA(ConcreteElementA concreteElementA);

    void visitConcreteElementB(ConcreteElementB concreteElementB);
}
