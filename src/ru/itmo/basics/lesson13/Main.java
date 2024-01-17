package ru.itmo.basics.lesson13;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        Thread myRunnable = new Thread(new MyRunnable());
        MyThread myThread = new MyThread();

//        myRunnable.start();
////        myRunnable.run();
//
//        try {
//            myRunnable.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        myThread.start();


//        new ThreadExample();
//        new ThreadExample();
//        new ThreadExample();
//        new ThreadExample();
//        new ThreadExample();

        myRunnable.setDaemon(true);

    }
}
