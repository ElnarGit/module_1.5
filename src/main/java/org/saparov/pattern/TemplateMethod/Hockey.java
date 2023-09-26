package org.saparov.pattern.TemplateMethod;

public class Hockey extends Game{

    @Override
    void initialize() {
        System.out.println("Игра в хоккей инициализирована");
    }

    @Override
    void startPlay() {
        System.out.println("Игра в хоккей началась");
    }

    @Override
    void endPlay() {
        System.out.println("Игра в хоккей закончилась");
    }
}
