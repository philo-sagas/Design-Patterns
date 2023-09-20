package com.gof.behavioral.mediator.example;

public class ClientMediator {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.createColleagues();
        mediator.triggerColleagueA();
        mediator.triggerColleagueB();
    }
}
