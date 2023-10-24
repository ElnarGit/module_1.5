package org.saparov.pattern.Singleton;

public class Main {
    public static void main(String[] args) {
        Counter counter = Counter.getCounter();
        System.out.println("Текущее значение счетчика: " + counter.getCount());

        counter.increment();
        System.out.println("Увеличение значения счетчика: " + counter.getCount());

        Counter anotherCounter = Counter.getCounter();
        System.out.println("Текущее значение счетчика через другой экземпляр: " + anotherCounter.getCount());
    }
}
