package com.gof.behavioral.mediator.example;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void operateB() {
        System.out.println("ConcreteColleagueB's operateB method is called.");
    }
}
