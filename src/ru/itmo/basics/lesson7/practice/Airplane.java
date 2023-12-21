package ru.itmo.basics.lesson7.practice;

import java.util.Scanner;

/*1.	Создайте класс Самолет. В классе создайте вложенный класс крыло.
Внутри класса Крыло реализуйте:
●	поле для хранения информации про вес крыла;
●	метод, что будет показывать вес крыла.

2.	Выполните предыдущее задание.
В главном классе создайте объект и добавьте во вложенный класс данные про вес крыла,
а также выведите информацию на экран.
Создайте два объекта и добавьте разный вес для крыльев.
*/
public class Airplane {
    Wing wing1 = new Wing();
    Wing wing2 = new Wing();


    private void getWing() {
        wing1.getWeigthWing();
        wing2.getWeigthWing();
    }

    private void setWing() {
        wing1.setWeigthWing();
        wing2.setWeigthWing();
    }

    class Wing {
        private int weigthWing;
        Scanner scanner = new Scanner(System.in);

        private void setWeigthWing() {
            System.out.println("Введите вес крыла ");
            weigthWing = scanner.nextInt();
        }

        private void getWeigthWing() {
            System.out.println("Крыло самолета имеет вес: " + weigthWing);
        }
    }

    public static void main(String[] args) {
        Airplane airplane1 = new Airplane();
        airplane1.wing1.setWeigthWing();
        airplane1.wing1.getWeigthWing();

        Airplane airplane2 = new Airplane();
        airplane2.wing2.setWeigthWing();
        airplane2.wing2.getWeigthWing();
    }
}
