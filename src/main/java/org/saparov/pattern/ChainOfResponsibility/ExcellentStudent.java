package org.saparov.pattern.ChainOfResponsibility;

public class ExcellentStudent implements StudentHandler {
	private StudentHandler nextHandler;
	
	@Override
	public void setNextHandler(StudentHandler handler) {
		this.nextHandler = handler;
	}
	
	@Override
	public void handleRequest(int averageGrade) {
		if(averageGrade >= 90){
			System.out.println("Студент: Этот студент - отличник.");
		}else if (nextHandler != null){
			nextHandler.handleRequest(averageGrade);
		} else {
			System.out.println("Не удалось определить статус.");
		}
	}
}
