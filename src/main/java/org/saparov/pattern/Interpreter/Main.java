package org.saparov.pattern.Interpreter;

public class Main {
    public static void main(String[] args) {
        Context context = new Context("Bob Tom");

        Expression bobExpression = new TerminalExpression("Bob");
        Expression tomExpression = new TerminalExpression("Tom");

        Expression orExpression = new OrExpression(bobExpression, tomExpression);
        Expression andExpression = new AndExpression(bobExpression, tomExpression);


        System.out.println("Имя содержит 'Bob' или 'Tom': " + orExpression.interpret(context.getData()));

        System.out.println("Имя содержит 'Bob' и 'Tom': " + andExpression.interpret(context.getData()));
    }
}
