package org.saparov.pattern.Composite;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        Group group = new Group();
        group.addShape(circle);
        group.addShape(square);

        group.draw();
    }
}
