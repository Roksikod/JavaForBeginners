package ru.itmo.basics.lesson11.strategy;

public class Training implements Activity {
    @Override
    public void work() {
        System.out.println("Training...");
    }
}
