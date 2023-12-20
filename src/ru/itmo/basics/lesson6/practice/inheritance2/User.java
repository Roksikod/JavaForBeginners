package ru.itmo.basics.lesson6.practice.inheritance2;

import java.util.Scanner;

public class User {
    int age;
    String name;
    Scanner scanner = new Scanner(System.in);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Введите имя ");
        this.name = scanner.next();
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Введите возраст ");
        this.age = scanner.nextInt();
    }

    //метод для получения возраста пользователя
    public String getUserInfo(String name, int age) {
        return ("Возраст пользователя: " + age);
    }
}
