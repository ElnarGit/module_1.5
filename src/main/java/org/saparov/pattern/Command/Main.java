package org.saparov.pattern.Command;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Собака");
        Animal cat = new Animal("Кошка");

        Command speakCommand = new SpeakCommand(dog);
        Command jumpCommand = new JumpCommand(cat);

        speakCommand.execute();
        jumpCommand.execute();
    }
}
