package org.saparov.pattern.Builder;

public class AnimalBuilder {
    private String name;
    private int age;
    private String color;

    public AnimalBuilder setName(String name){
        if (name == null){
            throw new IllegalArgumentException("Имя не должно быть null");
        }
        this.name = name;
        return this;
    }

    public AnimalBuilder setAge(int age){
        if (age <= 0){
            throw new IllegalArgumentException("Возраст не должен быть меньше 0");
        }
        this.age = age;
        return this;
    }

    public AnimalBuilder setColor(String color){
        if (color == null){
            throw new IllegalArgumentException("Цвет не должен быть null");
        }
        this.color = color;
        return this;
    }

    public Animal build(){
        return new Animal(name,age,color);
    }
}
