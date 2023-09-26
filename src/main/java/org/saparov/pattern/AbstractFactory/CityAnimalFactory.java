package org.saparov.pattern.AbstractFactory;

public class CityAnimalFactory implements AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
