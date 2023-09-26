package org.saparov.pattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private Map<Color, Shape> shapes = new HashMap<>();

    public Shape getShape(Color color){
        if (!shapes.containsKey(color)){
            Shape shape = new Circle(color);
            shapes.put(color, shape);
            System.out.println("Добавлен новый цвет: " + color);
        }
        return shapes.get(color);
    }
}
