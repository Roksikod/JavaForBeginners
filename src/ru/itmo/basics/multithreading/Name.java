package ru.itmo.basics.multithreading;
/*
Напишите программу, в которой создаются два потока, каждый из которых выводит
по очереди на консоль своё имя.
Начать можно с написания своего класс-потока, который выводит в бесконечном
цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и
notify().

 */
public class Name extends Thread {
    private final Object monitor;
    private String name;

    public Name(String name, Object monitor) {
        this.name = name;
        this.monitor = monitor;
    }

    @Override
    public void run() {
        synchronized (monitor) {
            while (true) {
                {
                    System.out.println(name);
                    monitor.notify();  //Wakes up all threads that are waiting on this object's monitor.
                    try {
                        monitor.wait(); //Causes the current thread to wait until it is awakened, typically by being notified
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

