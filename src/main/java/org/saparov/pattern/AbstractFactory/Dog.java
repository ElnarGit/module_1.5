package org.saparov.pattern.AbstractFactory;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog is bark");
    }
}
