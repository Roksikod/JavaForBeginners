package ru.itmo.basics.lesson2.practice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //work with Calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Сначала введите, пожалуйста, знак операции между числами");
        String operation = sc.nextLine();

        //Для проверки разных типов данных
        /*System.out.println("Введите, пожалуйста, два числа типа double");
        double numberDouble1 = Double.parseDouble(sc.next());
        double numberDouble2 = Double.parseDouble(sc.next());
        System.out.println("Введите, пожалуйста, два числа типа long");
        long numberLong1 = Long.parseLong(sc.next());
        long numberLong2 = Long.parseLong(sc.next());*/

            System.out.println("Введите, пожалуйста, два числа типа int");
            int numberInt1 = Integer.parseInt(sc.next());
            int numberInt2 = Integer.parseInt(sc.next());

        switch (operation) {
            case "+":
                //System.out.println(Calculator.add(numberDouble1, numberDouble2));
                //break;
                //System.out.println(Calculator.add(numberLong1, numberLong2));
                //break;
                System.out.println(Calculator.add(numberInt1, numberInt2));
                break;
            case "/":
                //System.out.println(Calculator.div(numberDouble1, numberDouble2));
                //break;
                //System.out.println(Calculator.div(numberLong1, numberLong2));
                //break;
                if (numberInt2 == 0) {
                    System.out.println("На ноль делить нельзя");
                    break;
                } else {
                    System.out.println(Calculator.div(numberInt1, numberInt2));
                    break;
                }
            case "*":
                //System.out.println(Calculator.multiple(numberDouble1, numberDouble2));
                //break;
                //System.out.println(Calculator.multiple(numberLong1, numberLong2));
                //break;
                System.out.println(Calculator.multiple(numberInt1, numberInt2));
                break;
            case "-":
                //System.out.println(Calculator.sub(numberDouble1, numberDouble2));
                //break;
                //System.out.println(Calculator.sub(numberLong1, numberLong2));
                //break;
                System.out.println(Calculator.sub(numberInt1, numberInt2));
                break;
            default:
                System.out.println("Проверьте корректность ввода");
        }


//Work with Box
        Box box = new Box(20, 25, 30);
        Box cube = new Box(100);
        Box defaultBox = new Box();
        cube.showVolume();
        box.showVolume();
        defaultBox.showVolume();
    }
}
