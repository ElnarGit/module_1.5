package org.saparov.pattern.SOLID.LSP2;

public class Dog implements Animal{
	
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	public void bark(){
		System.out.println("Dog is barking");
	}
}
