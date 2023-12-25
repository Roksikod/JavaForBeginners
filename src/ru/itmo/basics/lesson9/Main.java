package ru.itmo.basics.lesson9;

import ru.itmo.basics.lesson2.Car;
import ru.itmo.basics.lesson6.Child;
import ru.itmo.basics.lesson6.Parent;
import ru.itmo.basics.lesson6.AnotherChild;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(123);
        list.add("String");
        list.add(true);
        list.add(new Car());

//        System.out.println(list);


        List<String> strings = new ArrayList<>();
        strings.add("true");
        strings.add("123");
        strings.add("String");

//
//        System.out.println(strings);
//
////        StringBuilder builder = new StringBuilder();
////        for (String string : strings) {
////            builder.append(string).append(" ");
////        }
//
////        System.out.println(builder);
//
//
//        Collections.sort(strings);
//
//        System.out.println(strings);


        List<Integer> integers = new ArrayList<>();

        integers.add(123);
        integers.add(555);
        integers.add(555);
        integers.add(555);
        integers.add(555);
        integers.add(555);
        integers.add(555);
        integers.add(555);
        integers.add(555);
        integers.add(555);
        integers.add(555);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(13);
        integers.add(123123);
        integers.add(123123);
        integers.add(123123);
        integers.add(123123);
        integers.add(123123);
        integers.add(123123);
        integers.add(123123);
        integers.add(123123);
        integers.add(123123);
        integers.add(123123);
        integers.add(4123);


//        integers.remove(Integer.valueOf(555));
//
//        System.out.println(integers);


//        for (Integer integer : integers) {
//            if (integer % 2 != 0) {
//                integers.remove(integer);
//            }
//        }
//
//        System.out.println(integers);

//        Iterator<Integer> iterator = integers.iterator();
//
//        while (iterator.hasNext()) {
//            if (iterator.next()  % 2 != 0) {
//                iterator.remove();
//            }
//        }

//        System.out.println(integers);

        List<Integer> ints = Arrays.asList(123, 333, 545); // Java 8
        List<Integer> ints2 = List.of(123, 333, 545); // Java 11


//        ints.remove(Integer.valueOf(123)); // <- UnsupportedOperationException

        Set<String> set = new TreeSet<>();

        for (int i = 0; i < 100; i++) {
            set.add("Java");
        }

//        System.out.println(set);

        set.add("String");
        set.add("777");
        set.add("world!");
        set.add("Hello");

//        System.out.println(set);


//        Set<Integer> uniques = new HashSet<>(integers);
////        System.out.println(uniques);
//
//        Set.of();


        List<Parent> parents = new ArrayList<>();
        List<Child> children = new ArrayList<>();
        List<AnotherChild> anotherChildren = new ArrayList<>();
        someMethod(parents);
        someMethod(children);
        someMethod(anotherChildren);


        someMethod2(parents);
        someMethod2(children);
//        someMethod2(anotherChildren);  <- не является родственным классом для класса Child

        // key    value
        Map<String, Integer> map = new HashMap<>();

        map.put("John", 31311);
        map.put("Alice", 33342);
        map.put("Katie", 31311);
        map.put("Bob", 54542);
        map.put("Mike", 113366);
//        map.put("Mike", 3123213);


        System.out.println(map);

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();


//        Integer bob = map.get("Bob");
////        System.out.println(bob);
//
//        Integer alex = map.get("Alex");
//        System.out.println(alex);


        List<String> vals = getKeysByValue(map, 31311);

        System.out.println(vals);

    }


    public static void someMethod(List<? extends Parent> parents) {
        //logic
    }

    public static void someMethod2(List<? super Child> children) {
        //logic
    }


    public static List<String> getKeysByValue(Map<String, Integer> map, Integer value) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer val = pair.getValue();

            if (value.equals(val)) {
                result.add(key);
            }
        }

        return result;
    }
}