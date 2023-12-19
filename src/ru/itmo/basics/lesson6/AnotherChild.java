package ru.itmo.basics.lesson6;

public class AnotherChild extends  Parent {
    public AnotherChild(String name) {
        super(name);
    }

    public AnotherChild() {
    }

    @Override
    public void print() {
        System.out.println("Hello from another child!");
    }
}
