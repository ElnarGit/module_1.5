package org.saparov.pattern.SOLID.OCP.solution;

public class FileSaver implements Saver{
	@Override
	public void save() {
		System.out.println("Сохранение в файл");
	}
}
