package org.saparov.pattern.Bridge;

public class Main {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color black = new BlackColor();

        Shape redCircle = new Circle(red);
        System.out.println("Circle is: " + redCircle.applyColor());

        Shape blackSquare = new Square(black);
        System.out.println("Square is: " + blackSquare.applyColor());

    }
}
