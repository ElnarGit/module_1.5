package org.saparov.pattern.Command;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println(name + " издает звук");
    }

    public void jump(){
        System.out.println(name + " прыгает");
    }
}
