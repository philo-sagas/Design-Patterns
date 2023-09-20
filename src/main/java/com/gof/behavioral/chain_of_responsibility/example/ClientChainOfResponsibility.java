package com.gof.behavioral.chain_of_responsibility.example;

public class ClientChainOfResponsibility {
    public static void main(String[] args) {
        ConcreteHandlerA handlerA = new ConcreteHandlerA();
        ConcreteHandlerB handlerB = new ConcreteHandlerB(handlerA);
        Handler rootHandler = handlerB;
        System.out.println("--- STAGE: First 1st ---");
        handlerA.setState(true);
        handlerB.setState(true);
        rootHandler.handleRequest();
        System.out.println("--- STAGE: Second 2nd ---");
        handlerB.setState(false);
        rootHandler.handleRequest();
        System.out.println("--- STAGE: Third 3rd ---");
        handlerA.setState(false);
        rootHandler.handleRequest();
    }
}
