package org.saparov.pattern.Command;

public class SpeakCommand implements Command{
    private Animal animal;

    public SpeakCommand(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void execute() {
        animal.speak();
    }
}
