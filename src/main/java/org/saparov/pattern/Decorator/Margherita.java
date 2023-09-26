package org.saparov.pattern.Decorator;

public class Margherita implements Pizza{

    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public int getCost() {
        return 1600;
    }

}
