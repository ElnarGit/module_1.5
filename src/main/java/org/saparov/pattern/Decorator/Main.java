package org.saparov.pattern.Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza margheritaPizza = new Margherita();
        System.out.println("Description: " + margheritaPizza.getDescription());
        System.out.println("Cost: " + margheritaPizza.getCost());

        System.out.println();

        Pizza cheesePizza = new CheeseDecorator(margheritaPizza);
        System.out.println("Description: " + cheesePizza.getDescription());
        System.out.println("Cost: " + cheesePizza.getCost());

        System.out.println();

        Pizza peperoniPizza = new PepperoniDecorator(margheritaPizza);
        System.out.println("Description: " + peperoniPizza.getDescription());
        System.out.println("Cost: " + peperoniPizza.getCost());


    }
}
