package ru.itmo.basics.lesson6.practice.bank;

public abstract class Person {

    private String name;
    private String lastName;

    protected Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract void getInfo();
}
