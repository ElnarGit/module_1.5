package org.saparov.pattern.Memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("Hello World");
        history.save(editor.save());
        System.out.println("Current Text: " + editor.getText());
    
        System.out.println("--------------------------");

        editor.setText("Hiiii");
        history.save(editor.save());
        System.out.println("Current Text: " + editor.getText());
        
        System.out.println("--------------------------");
        
        editor.restore(history.get(0));
        System.out.println("После восстановления: " + editor.getText());
    }
}
