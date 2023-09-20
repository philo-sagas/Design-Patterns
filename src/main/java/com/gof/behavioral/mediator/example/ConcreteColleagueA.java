package com.gof.behavioral.mediator.example;

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void operateA() {
        System.out.println("ConcreteColleagueA's operateA method is called.");
    }
}
