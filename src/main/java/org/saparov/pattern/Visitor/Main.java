package org.saparov.pattern.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog1", 5);
        Dog dog2 = new Dog("Dog2", 3);
        Cat cat1 = new Cat("Cat1", 6);
        Cat cat2 = new Cat("Cat2", 2);

        List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(cat2);
        animals.add(cat1);
        
        Visitor infoVisitor = new AnimalInfoVisitor();
        
        for(Animal animal : animals){
            animal.accept(infoVisitor);
        }
    }
}
