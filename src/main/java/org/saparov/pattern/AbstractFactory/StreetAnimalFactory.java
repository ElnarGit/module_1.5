package org.saparov.pattern.AbstractFactory;

public class StreetAnimalFactory implements AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
