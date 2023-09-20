package com.gof.behavioral.interpreter.example;

public class ClientInterpreter {
    public static void main(String[] args) {
        Context context = new Context();
        context.assign("A", true);
        context.assign("B", false);
        context.assign("C", true);
        TerminalExpression terminalExpressionA = new TerminalExpression("A");
        TerminalExpression terminalExpressionB = new TerminalExpression("B");
        TerminalExpression terminalExpressionC = new TerminalExpression("C");
        NonterminalExpression nonterminalExpressionOr = new NonterminalExpression(
                terminalExpressionB, terminalExpressionC, "||"
        );
        NonterminalExpression nonterminalExpressionAnd = new NonterminalExpression(
                terminalExpressionA, nonterminalExpressionOr, "&&"
        );
        System.out.printf("The logical expression: %b && (%b || %b) = %b\n",
                context.lookup("A"),
                context.lookup("B"),
                context.lookup("C"),
                nonterminalExpressionAnd.interpret(context));
    }
}
