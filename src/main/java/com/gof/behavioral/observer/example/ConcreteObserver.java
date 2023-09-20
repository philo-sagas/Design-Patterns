package com.gof.behavioral.observer.example;

public class ConcreteObserver implements Observer {
    private Subject subject;

    private String state;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.state = null;
    }

    @Override
    public void update() {
        this.state = this.subject.getState();
    }

    public void changeSubjectState(String state) {
        this.subject.setState(state);
    }

    public String getState() {
        return this.state;
    }
}
