package ru.itmo.basics.multithreading;

/*
Выведете состояние потока перед его запуском, после запуска и во время
выполнения.

 */
public class ThreadFlow {

    public static void main(String[] args) {
        System.out.println("Start");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print(i);
                }
            }
        });
        System.out.println("Before: " + thread.getState()); //// get current thread state
        thread.start();
        System.out.println("\nIn progress: " + thread.getState());
        try {
            thread.join();  //Waits for this thread to die.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("\nAfter: " + thread.getState());
        System.out.println("\nFinish");
    }
}

