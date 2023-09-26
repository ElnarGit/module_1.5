package org.saparov.pattern.Flyweight;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape redCircle = factory.getShape(Color.RED);
        redCircle.draw();
        System.out.println();
        
        Shape whiteCircle = factory.getShape(Color.WHITE);
        whiteCircle.draw();
        System.out.println();
    
        Shape redCircle2 = factory.getShape(Color.RED);
        redCircle2.draw();
        System.out.println();

        Shape blackCircle = factory.getShape(Color.BLACK);
        blackCircle.draw();
    }
}
