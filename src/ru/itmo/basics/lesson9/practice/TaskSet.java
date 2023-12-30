package ru.itmo.basics.lesson9.practice;

import java.util.*;

public class TaskSet {
    public static void main(String[] args) {
        List<Integer> numbersArrayList = new ArrayList<>();
        System.out.println("Получен список случайных чисел: " + getArrayList(numbersArrayList));
        System.out.println("Тот же список без дублей: " + removeDuplicates(numbersArrayList));
    }

    //метод выдает коллекцию случайных чисел
    public static List<Integer> getArrayList(List<Integer> inputList) {
        for (int i = 0; i < 15; i++) {
            Random random = new Random();
            int num = random.nextInt(10);
            inputList.add(num);
        }
        Collections.sort(inputList);
        return inputList;
    }

    //метод формирует эту коллекцию без дубликатов
    public static Set<Integer> removeDuplicates(List<Integer> inputArrayList) {
        Set<Integer> numberSet = new TreeSet<>();
        numberSet.addAll(inputArrayList);
        return numberSet;
    }
}