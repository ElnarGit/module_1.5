package org.saparov.pattern.Mediator;

public class Main {
    public static void main(String[] args) {
        MediatorImpl mediator = new MediatorImpl();

        Friend friend1 = new Friend("Bob");
        Friend friend2 = new Friend( "Tom");
        
        mediator.registerFriend(friend1);
        mediator.registerFriend(friend2);

        friend1.send("Hello Tom");
        friend2.send("Hi Bob");
    }
}
