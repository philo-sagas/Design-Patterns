package com.gof.behavioral.mediator.example;

public class ConcreteMediator implements Mediator {
    private ConcreteColleagueA colleagueA;

    private ConcreteColleagueB colleagueB;

    public void createColleagues() {
        this.colleagueA = new ConcreteColleagueA(this);
        this.colleagueB = new ConcreteColleagueB(this);
    }

    public void triggerColleagueA() {
        this.colleagueA.changed();
    }

    public void triggerColleagueB() {
        this.colleagueB.changed();
    }

    @Override
    public void notify(Colleague colleague) {
        if (this.colleagueA.equals(colleague)) {
            System.out.println("ConcreteColleagueA notifies ConcreteColleagueB to synchronize data.");
            this.colleagueB.operateB();
        } else if (this.colleagueB.equals(colleague)) {
            System.out.println("ConcreteColleagueB notifies ConcreteColleagueA to synchronize data.");
            this.colleagueA.operateA();
        }
    }
}
