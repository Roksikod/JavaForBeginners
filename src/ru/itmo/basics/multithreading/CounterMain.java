package ru.itmo.basics.multithreading;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CounterMain {

    public static void main(String[] args) {
        Counter counter = new Counter();
        CountDownLatch countDownLatch = new CountDownLatch(1000);//число обращений по счетчику
        ExecutorService executorService = Executors.newFixedThreadPool(100);//число потоков

        for (int i = 0; i < 100; i++) {
            executorService.execute(new Runnable() {    //создание и работу с потоком отдаем
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        counter.increment(); //у объекта вызываем метод
                        countDownLatch.countDown(); //уменьшаем счетчик
                    }
                }
            });
            try {
                countDownLatch.await(); //ждем счетчик до нуля
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        executorService.shutdown(); //executorService больше не ждет потоков и работа прекращается
        System.out.println("All threads are terminated");
        System.out.println(counter.getCount());
    }
}

