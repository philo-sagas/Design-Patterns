package com.gof.behavioral.visitor.example;

import java.util.List;

public class ClientVisitor {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure(
                List.of(new ConcreteElementA("elementA_1"), new ConcreteElementB("elementB_1"))
        );
        objectStructure = new ObjectStructure(
                List.of(new ConcreteElementA("elementA_2"), new ConcreteElementB("elementB_2")),
                objectStructure
        );
        System.out.println("--- STAGE: Accept ConcreteVisitorA ---");
        ConcreteVisitorA visitorA = new ConcreteVisitorA();
        objectStructure.accept(visitorA);
        System.out.println("--- STAGE: Accept ConcreteVisitorB ---");
        ConcreteVisitorB visitorB = new ConcreteVisitorB();
        objectStructure.accept(visitorB);
    }
}
