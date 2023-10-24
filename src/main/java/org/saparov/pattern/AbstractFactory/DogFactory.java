package org.saparov.pattern.AbstractFactory;

public class DogFactory implements AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
    
    @Override
    public Food createFood() {
        return new DogFood();
    }
}
