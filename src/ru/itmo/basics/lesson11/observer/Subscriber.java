package ru.itmo.basics.lesson11.observer;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handelEvent(List<String> vacancies) {
        System.out.println(this.name + "! We have some changes in vacancies for you!\n" + vacancies);
    }
}
