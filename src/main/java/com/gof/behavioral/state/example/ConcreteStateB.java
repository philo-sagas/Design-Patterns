package com.gof.behavioral.state.example;

public class ConcreteStateB implements State {
    private static ConcreteStateB INSTANCE = new ConcreteStateB();

    public static ConcreteStateB getInstance() {
        return INSTANCE;
    }

    private ConcreteStateB() {
        // singleton
    }

    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateB's handle method is called.");
        context.changeState(ConcreteStateC.getInstance());
    }
}
