package com.gof.behavioral.template_method.example;

public abstract class AbstractClass {
    public void templateMethod() {
        System.out.println("AbstractClass's templateMethod method is called.");
        primitiveOperationA();
        primitiveOperationB();
    }

    protected abstract void primitiveOperationA();

    protected abstract void primitiveOperationB();
}
