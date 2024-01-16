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
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.getAndIncrement();
    }
    public int getCount() {
        return count.intValue();
    }
}
