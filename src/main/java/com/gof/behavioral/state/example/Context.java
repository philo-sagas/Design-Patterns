package com.gof.behavioral.state.example;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void request() {
        this.state.handle(this);
    }

    void changeState(State state) {
        this.state = state;
    }
}
