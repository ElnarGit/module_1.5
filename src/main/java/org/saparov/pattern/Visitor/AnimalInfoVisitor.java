package org.saparov.pattern.Visitor;

public class AnimalInfoVisitor implements Visitor{
	
	@Override
	public void visit(Dog dog) {
		System.out.println("Собака: " + dog.getName() + ", Возраст: " + dog.getAge() + " года");
	
	}
	
	@Override
	public void visit(Cat cat) {
		System.out.println("Кошка: " + cat.getName() + ", Возраст: " + cat.getAge() + " года");
	}
}
