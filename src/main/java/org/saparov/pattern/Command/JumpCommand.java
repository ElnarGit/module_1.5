package org.saparov.pattern.Command;

public class JumpCommand implements Command{
    private Animal animal;

    public JumpCommand(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void execute() {
        animal.jump();
    }
}
