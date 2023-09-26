package org.saparov.pattern.Decorator;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with cheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 200;
    }
}
