package com.gof.behavioral.state.example;

public class ConcreteStateC implements State {
    private static ConcreteStateC INSTANCE = new ConcreteStateC();

    public static ConcreteStateC getInstance() {
        return INSTANCE;
    }

    private ConcreteStateC() {
        // singleton
    }

    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateC's handle method is called.");
        context.changeState(ConcreteStateA.getInstance());
    }
}
