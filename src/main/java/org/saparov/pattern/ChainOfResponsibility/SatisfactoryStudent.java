package org.saparov.pattern.ChainOfResponsibility;

public class SatisfactoryStudent implements StudentHandler {
	
	@Override
	public void setNextHandler(StudentHandler handler) {
		//не имеет следующего обработчика
	}
	
	@Override
	public void handleRequest(int averageGrade) {
		if(averageGrade >= 70){
			System.out.println("Студент: Этот студент - студент с удовлетворительной успеваемостью.");
		}else {
			System.out.println("Не удалось определить статус.");
		}
	}
}
