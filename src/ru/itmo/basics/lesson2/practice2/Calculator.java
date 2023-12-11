package ru.itmo.basics.lesson2.practice2;

public class Calculator {
    //Add two numbers
    static double add(double number1, double number2) {
        return number1 + number2;
    }

    static long add(long number1, long number2) {
        return number1 + number2;
    }

    static int add(int number1, int number2) {
        return number1 + number2;
    }

    //Divide two numbers
    static double div(double number1, double number2) {
        if (number2 != 0) {
            return number1 / number2;
        }
        return 0;
    }

    static double div(long number1, long number2) {
        if (number2 != 0) {
            return (number1 * 1.0) / number2;
        }
        return 0;
    }

    static double div(int number1, int number2) {
        if (number2 != 0) {
            return (number1 * 1.0) / number2;
        }
        return 0;
    }

    //Multiple two numbers
    static double multiple(double number1, double number2) {
        return number1 * number2;
    }

    static long multiple(long number1, long number2) {
        return number1 * number2;
    }

    static int multiple(int number1, int number2) {
        return number1 * number2;
    }

    //Subtracting two numbers
    static double sub(double number1, double number2) {
        return number1 - number2;
    }

    static long sub(long number1, long number2) {
        return number1 - number2;
    }

    static int sub(int number1, int number2) {
        return number1 - number2;
    }
}
