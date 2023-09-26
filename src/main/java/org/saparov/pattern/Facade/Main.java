package org.saparov.pattern.Facade;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.start();

        System.out.println("-----------------------------");

        computer.shutdown();
    }
}
