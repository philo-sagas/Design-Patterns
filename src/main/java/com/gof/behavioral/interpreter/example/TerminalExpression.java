package com.gof.behavioral.interpreter.example;

public class TerminalExpression extends AbstractExpression {
    private String key;

    public TerminalExpression(String key) {
        this.key = key;
    }

    @Override
    public boolean interpret(Context context) {
        return context.lookup(key);
    }
}
