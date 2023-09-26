package org.saparov.pattern.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory cityFactory = new CityAnimalFactory();
        Animal cityAnimal = cityFactory.createAnimal();
        cityAnimal.makeSound();

        System.out.println("--------------------------");

        AnimalFactory streetFactory = new StreetAnimalFactory();
        Animal streetAnimal = streetFactory.createAnimal();
        streetAnimal.makeSound();
    }
}
