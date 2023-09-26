package org.saparov.pattern.State;

public class StateImpl2 implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Вы в состоянии 2");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Состоянии 2";
    }
}
