package com.gof.behavioral.command.example;

public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("ConcreteCommand invoke the receiver's action method.");
        this.receiver.action();
    }
}
