package org.saparov.pattern.Visitor;

public interface Visitor {
    void visit(Dog dog);

    void visit(Cat cat);
}
