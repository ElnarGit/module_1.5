package org.saparov.pattern.AbstractFactory;

public class CatFood implements Food{
	@Override
	public void describe() {
		System.out.println("Корм для кошек");
	}
}
