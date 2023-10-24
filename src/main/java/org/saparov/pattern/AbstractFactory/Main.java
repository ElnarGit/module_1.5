package org.saparov.pattern.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        Food catFood = catFactory.createFood();
        
        cat.makeSound();
        catFood.describe();
        
        System.out.println("--------------------------");

        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        Food dogFood = dogFactory.createFood();
        
        dog.makeSound();
        dogFood.describe();
    }
}
