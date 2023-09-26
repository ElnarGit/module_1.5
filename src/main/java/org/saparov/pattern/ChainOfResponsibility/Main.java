package org.saparov.pattern.ChainOfResponsibility;

public class Main {
	public static void main(String[] args) {
		StudentHandler excellentStudent = new ExcellentStudent();
		StudentHandler goodStudent = new GoodStudent();
		StudentHandler satisfactoryStudent = new SatisfactoryStudent();
		
		excellentStudent.setNextHandler(goodStudent);
		goodStudent.setNextHandler(satisfactoryStudent);
		
		
		excellentStudent.handleRequest(97);
		excellentStudent.handleRequest(85);
		excellentStudent.handleRequest(72);
	
		
	}
}
