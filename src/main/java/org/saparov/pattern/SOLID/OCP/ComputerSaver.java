package org.saparov.pattern.SOLID.OCP;

/*
Здесь идет нарушение принципа OCP так как если мы хотим добавить еще что-то
куда будем сохранять данные, мы нарушим наш принцип, потому что мы пытаемся изменить
существующую сущность
* */
public class ComputerSaver {
	
	public void saveToDB(){
		System.out.println("Сохранение в базу данных");
	}
	
	public void saveToFile(){
		System.out.println("Сохранение в файл");
	}
	
	public void saveToDisk(){
		System.out.println("Сохранение в диск");
	}
}
