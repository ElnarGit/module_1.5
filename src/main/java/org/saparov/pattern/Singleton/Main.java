package org.saparov.pattern.Singleton;

public class Main {
    public static void main(String[] args) {
        Counter counter = Counter.getCounter();
        System.out.println("Current counter value: " + counter.getCount());

        counter.increment();
        System.out.println("Increment counter value: " + counter.getCount());

        Counter anotherCounter = Counter.getCounter();
        System.out.println("Current counter value via another instance: " + anotherCounter.getCount());
    }
}
