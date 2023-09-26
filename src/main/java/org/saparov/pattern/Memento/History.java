package org.saparov.pattern.Memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<TextMemento> states = new ArrayList<>();

    public void save(TextMemento memento){
        states.add(memento);
    }

    public TextMemento get(int index){
        return states.get(index);
    }
}
