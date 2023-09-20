package com.gof.behavioral.state.example;

public class ConcreteStateA implements State {
    private static ConcreteStateA INSTANCE = new ConcreteStateA();

    public static ConcreteStateA getInstance() {
        return INSTANCE;
    }

    private ConcreteStateA() {
        // singleton
    }

    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateA's handle method is called.");
        context.changeState(ConcreteStateB.getInstance());
    }
}
