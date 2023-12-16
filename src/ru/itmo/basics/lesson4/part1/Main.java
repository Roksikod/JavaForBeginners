package ru.itmo.basics.lesson4.part1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //программа выводит на консоль нечетные числа от 1 до 99
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
        }
        System.out.println();

        //программа выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5)
        String numbersDivided3 = "Делится на 3: ";
        String numbersDivided5 = "Делится на 5: ";
        String numbersDivided3and5 = "Делится на 3 и на 5: ";

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                numbersDivided3 += Integer.toString(i) + ", ";
            }
            if (i % 5 == 0) {
                numbersDivided5 += Integer.toString(i) + ", ";
            }
            if (i % 3 == 0 && i % 5 == 0) {
                numbersDivided3and5 += Integer.toString(i) + ", ";
            }
        }

        System.out.println(numbersDivided3);
        System.out.println(numbersDivided5);
        System.out.println(numbersDivided3and5);

        //программа, чтобы вычислить сумму двух целых чисел и вернуть true,
        // если сумма равна третьему целому числу
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();
        System.out.println("Введите третье число:");
        int num3 = sc.nextInt();
        sc.close();
        System.out.println(num1 + num2 == num3);*/

        //программа принимает от пользователя три целых числа и возвращает true,
        // если второе число больше первого числа, а третье число больше второго числа.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();
        System.out.println("Введите третье число:");
        int num3 = sc.nextInt();
        sc.close();
        System.out.println(num2 > num1 && num3 > num2);
    }
}

