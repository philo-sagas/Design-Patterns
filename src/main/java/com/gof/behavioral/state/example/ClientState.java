package com.gof.behavioral.state.example;

public class ClientState {
    public static void main(String[] args) {
        Context context = new Context(ConcreteStateA.getInstance());
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
