package ru.itmo.basics.lesson6.practice.inheritance2;

import java.util.Scanner;

public class User {
    int age;
    String name;
    Scanner scanner = new Scanner(System.in);


    public String getName() {
        return name;
    }

    public void setName() {
        this.name = scanner.next();
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = scanner.nextInt();
    }

    //метод для получения возраста пользователя
    public String getUserInfo() {
        System.out.println("Введите возраст ");
        age = scanner.nextInt();
        return ("Возраст пользователя: " + age);
    }
}
