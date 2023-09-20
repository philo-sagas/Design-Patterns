package com.gof.behavioral.command.example;

public class ClientCommand {
    public static void main(String[] args) {
        Invoker invoker = Invoker.getInstance();
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        invoker.storeCommand(command);
        invoker.preform();
    }
}
