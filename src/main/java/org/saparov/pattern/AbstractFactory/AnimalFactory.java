package org.saparov.pattern.AbstractFactory;

public interface AnimalFactory {
    Animal createAnimal();
    
    Food createFood();
}
