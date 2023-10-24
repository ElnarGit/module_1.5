package org.saparov.pattern.SOLID.DIP;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void greet(){
		System.out.println("Привет, меня зовут " + name);
	}
}
