package com.gof.behavioral.memento.example;

public class Originator {
    private String state;

    public Originator() {
        this.state = "";
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return this.state;
    }

    public void increase(String value) {
        this.state += value;
    }
}
