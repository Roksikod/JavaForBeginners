package ru.itmo.basics.multithreading;

/*
Напишите программу, в которой создаются два потока, каждый из которых выводит
по очереди на консоль своё имя.
Начать можно с написания своего класс-потока, который выводит в бесконечном
цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и
notify().

 */
public class Name extends Thread{
    private Object monitor;

    public Name(Object object) {
        this.monitor = object;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (monitor) {
                try {
                    System.out.println(getName());
                    monitor.notify();  //Wakes up all threads that are waiting on this object's monitor.
                    monitor.wait(); //Causes the current thread to wait until it is awakened, typically by being notified
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class ShowName {
    public static void main(String[] args) {
        Object monitor = new Object();
        Thread Marco = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Marco");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread Polo = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Polo");
                    try {
                        Thread.sleep(1000);
                        Thread.interrupted();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        Marco.start();
        Polo.start();
    }
}

