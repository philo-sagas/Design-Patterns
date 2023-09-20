package com.gof.behavioral.observer.example;

public class ClientObserver {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        ConcreteObserver observerA = new ConcreteObserver(subject);
        subject.attach(observerA);
        ConcreteObserver observerB = new ConcreteObserver(subject);
        subject.attach(observerB);
        ConcreteObserver observerC = new ConcreteObserver(subject);
        subject.attach(observerC);
        System.out.println("--- STAGE: Initial Subject State ---");
        System.out.printf("The observerA's state: %s\n", observerA.getState());
        System.out.printf("The observerB's state: %s\n", observerB.getState());
        System.out.printf("The observerC's state: %s\n", observerC.getState());
        observerA.changeSubjectState("NewState");
        System.out.println("--- STAGE: Changed Subject State ---");
        System.out.printf("The observerA's state: %s\n", observerA.getState());
        System.out.printf("The observerB's state: %s\n", observerB.getState());
        System.out.printf("The observerC's state: %s\n", observerC.getState());
    }
}
