package org.saparov.pattern.AbstractFactory;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat is meow");
    }
}
