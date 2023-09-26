package org.saparov.pattern.Visitor;

public class Cat implements Animal{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
