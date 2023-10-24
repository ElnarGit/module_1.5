package org.saparov.pattern.SOLID.DIP;

public class GreetingService {
	private Person person;
	
	public GreetingService() {
		this.person = new Person("Bob");
	}
	
	public void greatPerson(){
		person.greet();
	}
}
