package com.gof.behavioral.memento.example;

public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    String getState() {
        return this.state;
    }
}
