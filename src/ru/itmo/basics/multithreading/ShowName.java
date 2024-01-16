package ru.itmo.basics.multithreading;

public class ShowName {
    public static void main(String[] args) {
        Object monitor = new Object();

        Name name1 = new Name("Marco", monitor);
        Name name2 = new Name("Polo",  monitor);
        name1.start();
        name2.start();
    }
}
