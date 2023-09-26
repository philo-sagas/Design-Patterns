package com.gof.creational.prototype.example;

public class ClientPrototype {
    public static void main(String[] args) {
        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        prototypeA.setState("StateA");
        Prototype prototypeCloneA = prototypeA.clone(false);
        System.out.printf("The prototypeCloneA's object is %s.\n", prototypeCloneA);

        ConcretePrototypeB prototypeB = new ConcretePrototypeB();
        prototypeB.setState("StateB");
        Prototype prototypeCloneB = prototypeB.clone(false);
        System.out.printf("The prototypeCloneB's object is %s.\n", prototypeCloneB);
    }
}
