package ru.itmo.basics.lesson1;

import java.util.Scanner;

/*
For correct run of two last tasks
please use only one of them,
another have to comment!
They both need Scanner.
 */

public class Main {
    public static void main(String[] args) {
        printAffirmation(); //task1
        getResult();  //task2
        getResultTask3(); //task3
        multiply(); // task4
        //workWithSystem(); //task5
        workWithIfElse(); //task6
    }

    /*Task 1. Выведите строки в следующем порядке:
           Я
           хорошо
           знаю
           Java.*/
    public static void printAffirmation() {
        String[] affirmation = {"Я", "хорошо", "знаю", "Java."};
        for (String s : affirmation) {
            System.out.println(s);
        }
    }

    /* Task 2. Посчитайте результат выражения
            (46 + 10) * (10 / 3)
            (29) * (4) * (-15)*/
    public static void getResult() {
        System.out.println((46 + 10) * (10 / 3));
        System.out.println((29) * (4) * (-15));
    }

    /* Task 3. В переменной number, лежит целое число 10500. В переменной result посчитайте следующее
    выражение: (number / 10) / 10. Результат выведите на консоль.*/
    public static void getResultTask3() {
        int number = 10500;
        double resultInt = (double) (number / 10) / 10;
        int resultDouble = (number / 10) / 10;
        System.out.println("Int result: " + resultInt + ". Double result: " + resultDouble + ".");
    }

    /* Task 4. Даны три числа: 3.6, 4.1, 5.9.
    В переменной result посчитайте произведение этих чисел.*/
    public static void multiply() {
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        System.out.println(a * b * c);
    }

    /* Task 5. В этой задаче вы должны считать целые числа из стандартного ввода,
    а затем вывести.
    Каждое целое число нужно печатать с новой строки.
    Формат ввода:
            42
            100
            125*/
    public static void workWithSystem() {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        scn.close();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    /* Task 6. Для целого числа b выполните следующие условные действия:
            ● Если b нечетное, выведите “Нечетное”
            ● Если b четное, выведите “Четное”
            ● Если b четное и больше 100, выведите “Выход за пределы диапазона”*/
        public static void workWithIfElse() {
            Scanner scn = new Scanner(System.in);
            int b = scn.nextInt();
            if (b % 2 != 0) {
                System.out.println("Нечетное");
            } else if (b > 100) {
                System.out.println("Выход за пределы диапазона");
            } else {
                System.out.println("Четное");
            }
            scn.close();
        }
}
