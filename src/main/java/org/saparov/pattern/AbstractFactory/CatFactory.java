package org.saparov.pattern.AbstractFactory;

public class CatFactory implements AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
    
    @Override
    public Food createFood() {
        return new CatFood();
    }
}
