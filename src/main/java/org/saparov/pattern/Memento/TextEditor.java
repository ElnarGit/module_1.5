package org.saparov.pattern.Memento;

public class TextEditor {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextMemento save(){
        return new TextMemento(text);
    }

    public void restore(TextMemento memento){
        this.text = memento.getText();
    }
}
