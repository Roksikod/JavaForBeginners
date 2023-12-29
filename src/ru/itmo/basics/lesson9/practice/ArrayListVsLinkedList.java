package ru.itmo.basics.lesson9.practice;

import java.util.*;

/*
 Тест показал: добавление в ArrayList - 10-16 миллисек
               добавление в LinkedList - 110-116

               получение наугад из ArrayList - 10 - 15
               получение наугад из LinkedList - порядка 10_000

               удаление наугад из ArrayList - 180-190
               удаление наугад из LinkedList - до 10

      В связных списках быстрая обработка (удаление), потому что двигать все элементы не надо,
      достаточно изменить две пары ссылок. ArrayList быстрее хранят и извлекают данные.
 */
public class ArrayListVsLinkedList {
    public static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("На заполнение ArrayList миллионом элементов в миллисекундах ушло: "
                + addToArrayList(arrayList));
        LinkedList<Integer> linkedList = new LinkedList();
        System.out.println("На заполнение LinkedList миллионом элементов в миллисекундах ушло: "
                + addToLinkedList(linkedList));
        System.out.println();
        System.out.println("На получение 100 тысяч элементов наугад из ArrayList в миллисекундах ушло: "
                + getFromArrayList(arrayList));
        System.out.println("На получение 100 тысяч элементов наугад из LinkedList в миллисекундах ушло: "
                + getFromLinkedList(linkedList));

        System.out.println();
        System.out.println("Удаление 100 тысяч элементов наугад из ArrayList в миллисекундах ушло: "
                + removeFromArrayList(arrayList));
        System.out.println("На получениеУдаление 100 тысяч элементов наугад из LinkedList в миллисекундах ушло: "
                + removeFromLinkedList(linkedList));


    }

    //запись данных в списки
    public static long addToArrayList(ArrayList<Integer> arrayList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long stop = System.currentTimeMillis();
        return stop - start;
    }

    public static long addToLinkedList(LinkedList<Integer> linkedList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000_000; i++) {
            linkedList.add(i);
        }
        long stop = System.currentTimeMillis();
        return stop - start;
    }

    //получение данных из списка
    public static long getFromArrayList(ArrayList<Integer> inputArrayList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            inputArrayList.get(random.nextInt(1000000));
        }
        long stop = System.currentTimeMillis();
        return stop - start;
    }

    public static long getFromLinkedList(LinkedList<Integer> inputLinkedList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            inputLinkedList.get(random.nextInt(1000000));
        }
        long stop = System.currentTimeMillis();
        return stop - start;
    }

    public static long removeFromArrayList(ArrayList<Integer> inputArrayList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            inputArrayList.remove(random.nextInt(1000));
        }
        long stop = System.currentTimeMillis();
        return stop - start;
    }

    public static long removeFromLinkedList(LinkedList<Integer> inputLinkedList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            inputLinkedList.remove(random.nextInt(1000));
        }
        long stop = System.currentTimeMillis();
        return stop - start;
    }
}

