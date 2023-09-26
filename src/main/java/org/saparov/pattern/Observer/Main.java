package org.saparov.pattern.Observer;

public class Main {
    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();

        ObserverImpl observer1 = new ObserverImpl("Наблюдатель 1");
        ObserverImpl observer2 = new ObserverImpl("Наблюдатель 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState("Новое состояние");
        
        //subject.removeObserver(observer1);

        System.out.println();

        subject.setState("Ещё одно состояние");
    }
}
