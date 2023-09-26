package org.saparov.pattern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 20; i++){
            integers.add(random.nextInt(20));
        }

        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()){
            Integer number = iterator.next();
            System.out.println(number);
        }
    }
}
