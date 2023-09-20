package com.gof.behavioral.observer.example;

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers;

    public Subject() {
        this.observers = new LinkedList<>();
    }

    public abstract String getState();

    public abstract void setState(String state);

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    public void notify(String event) {
        this.observers.stream().forEach(observer -> observer.update());
    }
}
