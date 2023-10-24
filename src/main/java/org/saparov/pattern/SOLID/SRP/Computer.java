package org.saparov.pattern.SOLID.SRP;

/*
Здесь происходит нарушение принципа SRP, так как класс Computer делает 3 вещи:
     1)Представляет информацию о компьютере
     2)Делает сохранение в базу данных
     3)Делает загрузку из базы данных
* */

public class Computer {
	private String name;
	private int memory_size;
	
	public Computer(String name, int memory_size) {
		this.name = name;
		this.memory_size = memory_size;
	}
	
	public void save(){
		System.out.println("Сохранение объекта в базу данных");
	}
	
	public void load(){
		System.out.println("Загрузка объекта из базы данных");
	}
}
