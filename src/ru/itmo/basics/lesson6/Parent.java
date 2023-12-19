package ru.itmo.basics.lesson6;

public class Parent {
    protected String name;

    public Parent(String name) {
        this.name = name;
    }

    public Parent() {
    }

    public void print() {
        System.out.println("Method from " + this.getClass().getSimpleName() + " class");
    }


    public final void info() {

    }
}
