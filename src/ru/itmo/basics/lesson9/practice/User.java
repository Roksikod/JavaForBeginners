package ru.itmo.basics.lesson9.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<User, Integer> users = getUsers();
        System.out.println("Список игроков: ");
        for (User user : users.keySet()) {
            System.out.println(user.getName());
        }

        System.out.print("Введите имя игрока, чтобы узнать его счет: ");
        String user = scanner.nextLine();
        System.out.println(getScore(users, user));
    }


    public static String getScore(Map<User, Integer> users, String name) {
        String message = "";
        for (User user : users.keySet()) {
            if (user.getName().toLowerCase().equals(name.toLowerCase())) {
                message = "Счет этого игрока: " + users.get(user).toString();
                return message;
            }
        }
        message = "Такого участника не нашлось(";
        return message;
    }

    public static Map<User, Integer> getUsers() {
        Map<User, Integer> outputMap = new HashMap<>();
        Random random = new Random();

        String[] arrayNames = new String[10];
        arrayNames[0] = "Василий";
        arrayNames[1] = "Петр";
        arrayNames[2] = "Николай";
        arrayNames[3] = "Иван";
        arrayNames[4] = "Сергей";
        arrayNames[5] = "Вячеслав";
        arrayNames[6] = "Василиса";
        arrayNames[7] = "Анна";
        arrayNames[8] = "Нина";
        arrayNames[9] = "Светлана";

        for (int i = 0; i < 10; i++) {
            outputMap.put(new User((arrayNames[i])), random.nextInt(950));
        }
        return outputMap;
    }
}
