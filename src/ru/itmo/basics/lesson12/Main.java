package ru.itmo.basics.lesson12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(3242);
        ints.add(323);
        ints.add(123);

        System.out.println(ints);

//        for (Integer i : ints) {
//            System.out.println(i);
//        }

//        ints.forEach(System.out::println);

        ints.removeIf(i -> i > 123);

        System.out.println(ints);

    }
}
