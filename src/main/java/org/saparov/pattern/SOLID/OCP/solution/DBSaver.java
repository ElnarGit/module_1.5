package org.saparov.pattern.SOLID.OCP.solution;

public class DBSaver implements Saver{
	
	@Override
	public void save() {
		System.out.println("Сохранение в базу данных");
	}
}
