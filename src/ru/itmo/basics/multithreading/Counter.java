package ru.itmo.basics.multithreading;

/*
Дан класс:
class Counter {
     int count = 0;

    public void increment() {
        count = count + 1;
    }
    public int getCount() {
     return count;
}
}

Напишите программу, в которой запускается 100 потоков, каждый из которых
вызывает метод increment() 1000 раз.
После того, как потоки завершат работу count должен быть равен 100000 при  каждом запуске программы .
Если обнаружилась проблема, предложите ее решение.

 */
//Проблема, которая возникла, называется состояние гонки.
// Когда несколько потоков обращаются к одному и тому же методу,
//каждый поток записывает туда в переменную count значение.
// Кто успел и когда - от этого зависит значение переменной.
//Решение проблемы: синхронизация потоков + join()
//
// Синхронизацию можно сделать, если добавить ключевое слово synchronized () к методу
//или создать {} блок синхронизации и добавить монитор - объект синхронизации.
//Также надо использовать метод join()
//Этот метод приостанавливает поток, В КОТОРОМ вызвали этот метод,
//и ждет завершения работы потока, У КОТОРОГО вызвали этот метод

/*Во всех случаях, когда обращение к переменной идет из нескольких потоков,
рекомендуется сделать ее volatile.
 Но синхронизацию делать все равно придется.
 volatile запрещает кэширование переменной, но проблему гонки не решает!
 */

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    /*
    int count = 0;
    public void increment() {
        count = count + 1;
    }
    public int getCount() {
        return count;
    }
*/
    public final Object monitor = new Object();//монитор для синхронизации
    private AtomicInteger count = new AtomicInteger();
    //атомики позволяют осуществить
    // обращение к переменной, получение нового значения и установление его
    // за одну операцию. Их ценят за методы

    public void inc() {
        count.getAndIncrement();
    }

    public int getCount() {
        return count.intValue();
    }
}

class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        synchronized (counter.monitor) {
            for (int i = 0; i < 100; i++) {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 1000; i++) {
                            counter.inc();
                        }
                    }
                });
                thread.start();
                try {
                    thread.join();
                    //в главном потоке здесь остановка и ожидание завершения работы потока thread
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(counter.getCount());
        }
    }
}

