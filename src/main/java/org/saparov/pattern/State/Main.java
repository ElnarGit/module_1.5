package org.saparov.pattern.State;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        State state1 = new StateImpl1();
        state1.doAction(context);

        System.out.println("Текущее состояние: " + context.getState());

        State state2 = new StateImpl2();
        state2.doAction(context);

        System.out.println("Текущее состояние: " + context.getState());
    
        
    }
}
