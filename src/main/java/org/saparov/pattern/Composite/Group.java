package org.saparov.pattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Shape{
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    @Override
    public void draw() {
        for(Shape shape : shapes){
            shape.draw();
        }

    }
}
