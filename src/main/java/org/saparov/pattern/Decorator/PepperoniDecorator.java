package org.saparov.pattern.Decorator;

public class PepperoniDecorator extends PizzaDecorator{

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with peperoni";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 500;
    }
}
