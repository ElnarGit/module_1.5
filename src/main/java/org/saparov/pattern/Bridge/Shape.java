package org.saparov.pattern.Bridge;

public abstract class Shape {
    public Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract String applyColor();
}
