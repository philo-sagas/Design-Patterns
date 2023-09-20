package com.gof.behavioral.interpreter.example;

public class NonterminalExpression extends AbstractExpression {
    private AbstractExpression expressionA;

    private AbstractExpression expressionB;

    private String relationship;

    public NonterminalExpression(AbstractExpression expressionA, AbstractExpression expressionB, String relationship) {
        this.expressionA = expressionA;
        this.expressionB = expressionB;
        this.relationship = relationship;
    }

    @Override
    public boolean interpret(Context context) {
        if ("||".equalsIgnoreCase(relationship)) {
            return this.expressionA.interpret(context) || this.expressionB.interpret(context);
        } else if ("&&".equalsIgnoreCase(relationship)) {
            return this.expressionA.interpret(context) && this.expressionB.interpret(context);
        }
        return false;
    }
}
