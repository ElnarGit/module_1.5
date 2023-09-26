package org.saparov.pattern.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        Game hockey = new Hockey();
        Game football = new Football();

        hockey.play();

        System.out.println("--------------------");

        football.play();
    }
}
