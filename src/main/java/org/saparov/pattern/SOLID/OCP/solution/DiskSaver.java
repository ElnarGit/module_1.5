package org.saparov.pattern.SOLID.OCP.solution;

public class DiskSaver implements Saver{
	
	@Override
	public void save() {
		System.out.println("Сохранение в диск");
	}
}
