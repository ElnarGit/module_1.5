package org.saparov.pattern.AbstractFactory;

public class DogFood implements Food{
	@Override
	public void describe() {
		System.out.println("Корм для собак");
	}
}
