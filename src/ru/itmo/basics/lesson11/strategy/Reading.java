package ru.itmo.basics.lesson11.strategy;

public class Reading implements Activity{
    @Override
    public void work() {
        System.out.println("Reading...");
    }
}