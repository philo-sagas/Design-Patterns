package com.gof.behavioral.template_method.example;

public class ConcreteClass extends AbstractClass {
    @Override
    protected void primitiveOperationA() {
        System.out.println("ConcreteClass's primitiveOperation1 method is called.");
    }

    @Override
    protected void primitiveOperationB() {
        System.out.println("ConcreteClass's primitiveOperation2 method is called.");
    }
}
