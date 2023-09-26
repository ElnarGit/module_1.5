package org.saparov.pattern.TemplateMethod;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Игра в футбол инициализирована");
    }

    @Override
    void startPlay() {
        System.out.println("Игра в футбол началась");
    }

    @Override
    void endPlay() {
        System.out.println("Игра в футбол закончилась");
    }
}
