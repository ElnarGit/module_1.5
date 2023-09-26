package org.saparov.pattern.Mediator;

public class Friend {
    private Mediator mediator;
    private String name;

    public Friend(String name) {
        this.name = name;
    }
    
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    
    public void send(String message){
        mediator.send(message,this);
    }

    public void receive(String message){
        System.out.println(name + " получил: " + message);
    }
}
