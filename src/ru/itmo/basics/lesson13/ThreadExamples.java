package ru.itmo.basics.lesson13;

public class ThreadExamples extends Thread {
    public ThreadExamples() {
        this.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " passes itself queue to the next thread");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + " has finished executing");
    }
}