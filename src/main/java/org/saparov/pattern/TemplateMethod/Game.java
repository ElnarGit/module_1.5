package org.saparov.pattern.TemplateMethod;

public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
