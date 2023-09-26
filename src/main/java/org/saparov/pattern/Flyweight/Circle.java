package org.saparov.pattern.Flyweight;

public class Circle implements Shape{
    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Отрисовка круга с цветом " + color);
    }
}
