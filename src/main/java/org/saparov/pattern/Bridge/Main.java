package org.saparov.pattern.Bridge;

public class Main {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color black = new BlackColor();
        Color blue = new BlueColor();

        Shape redCircle = new Circle(red);
        System.out.println("Circle is: " + redCircle.applyColor());

        Shape blackSquare = new Square(black);
        System.out.println("Square is: " + blackSquare.applyColor());
    
        Shape blueSquare = new Square(blue);
        System.out.println("Square is: " + blueSquare.applyColor());

    }
}
