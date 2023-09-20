package com.gof.behavioral.memento.example;

public class ClientMemento {
    public static void main(String[] args) {
        Caretaker caretaker = Caretaker.getInstance();
        Originator originator = new Originator();
        originator.increase("init");
        caretaker.backup(originator);
        System.out.printf("The originator's backup state: %s\n", originator.getState());
        originator.increase("_first");
        caretaker.backup(originator);
        System.out.printf("The originator's backup state: %s\n", originator.getState());
        originator.increase("_second");
        System.out.printf("The originator's current state: %s\n", originator.getState());
        caretaker.recover(originator);
        System.out.printf("The originator's recover state: %s\n", originator.getState());
        caretaker.recover(originator);
        System.out.printf("The originator's recover state: %s\n", originator.getState());
    }
}
