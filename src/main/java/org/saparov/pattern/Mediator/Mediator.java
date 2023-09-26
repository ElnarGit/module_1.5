package org.saparov.pattern.Mediator;

public interface Mediator {
    void send(String message, Friend sender);
}
