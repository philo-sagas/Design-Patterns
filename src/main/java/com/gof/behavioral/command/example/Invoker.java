package com.gof.behavioral.command.example;

import java.util.LinkedList;
import java.util.List;

public class Invoker {
    private static Invoker INSTANCE = new Invoker();

    public static Invoker getInstance() {
        return INSTANCE;
    }

    private List<Command> commands;

    private Invoker() {
        this.commands = new LinkedList<>();
    }

    public void storeCommand(Command command) {
        this.commands.add(command);
    }

    public void removeCommand(Command command) {
        this.commands.remove(command);
    }

    public void preform() {
        this.commands.stream().forEach(command -> command.execute());
    }
}
