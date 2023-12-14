package ru.itmo.basics.lesson4.part1;

import java.util.Scanner;

public class ArraysTasks5and6 {
    public static void main(String[] args) {

        //программу, чтобы проверить,
        // появляется ли число 3 как первый или последний элемент массива целых чисел.
        // Длина массива должна быть больше или равна двум
        Scanner sc = new Scanner(System.in);
        int lengthArray;
        while (true) {
            System.out.println("Введите длину массива. Она должна быть не меньше, чем 2");
            lengthArray = sc.nextInt();
            if (lengthArray >= 2) {
                break;
            }
        }

        System.out.println("Заполните массив");
        int[] numbers = inputArray(lengthArray);
        sc.close();

//задание 5: массив начинается ли с 3 или заканчивается ли на 3
        String arrayAsString = getNumbersFromArray(numbers); //вывод чисел массива через запятую
        System.out.println("array = " + arrayAsString);
        System.out.println(startOrFinishWithThree(numbers));

        //задание 6: массив содержит ли число 1 или 3
        System.out.println(containsOneOrThree(numbers));
    }

    //заполнение массива
    public static int[] inputArray(int lengthArray) {
        int[] numbers = new int[lengthArray];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lengthArray; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();
        return numbers;
    }

    //для выведения чисел массива через запятую
    private static String getNumbersFromArray(int[] nums) {
        String s = "";
        for (int i = 0; i < nums.length - 1; i++) {
            s += Integer.toString(nums[i]) + ", ";
        }
        return s + Integer.toString(nums[(nums.length - 1)]);
    }

    //метод для задания 5
    private static boolean startOrFinishWithThree(int[] numbers) {
        return numbers[0] == 3 || numbers[numbers.length - 1] == 0;
    }

    //метод для задания 6 - проверить, что массив содержит число 1 или 3
    private static boolean containsOneOrThree(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 3) {
                return true;
            }
        }
        return false;
    }
}

