package org.saparov.pattern.FactoryMethod;

public class Square implements Shape{
	
	@Override
	public void draw() {
		System.out.println("Рисуем квадрат");
	}
}
