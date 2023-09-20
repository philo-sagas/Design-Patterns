package com.gof.behavioral.mediator.example;

public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changed() {
        this.mediator.notify(this);
    }
}
