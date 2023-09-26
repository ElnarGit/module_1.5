package org.saparov.pattern.Builder;

public class Main {
    public static void main(String[] args) {
        AnimalBuilder builder = new AnimalBuilder();

        Animal animal = builder
                .setName("Bon")
                .setAge(6)
                .setColor("White")
                .build();

        System.out.println("Name is: " + animal.getName());
        System.out.println("Age is: " + animal.getAge());
        System.out.println("Color is: " + animal.getColor());
    }
}
