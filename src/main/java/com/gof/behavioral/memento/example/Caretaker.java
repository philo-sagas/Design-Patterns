package com.gof.behavioral.memento.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class Caretaker {
    private static Caretaker INSTANCE = new Caretaker();

    public static Caretaker getInstance() {
        return INSTANCE;
    }

    private Deque<Memento> stack;

    private Caretaker() {
        this.stack = new ArrayDeque<>();
    }

    public void backup(Originator originator) {
        Memento memento = originator.createMemento();
        this.stack.push(memento);
    }

    public void recover(Originator originator) {
        Memento memento = this.stack.pop();
        originator.setMemento(memento);
    }
}
