package org.saparov.pattern.ChainOfResponsibility;

public interface StudentHandler {
	void setNextHandler(StudentHandler handler);
	
	void handleRequest(int averageGrade);
	
}
