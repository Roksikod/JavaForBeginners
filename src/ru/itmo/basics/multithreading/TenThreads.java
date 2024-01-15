package ru.itmo.basics.multithreading;

//Напишите программу, в которой запускается 10 потоков и каждый из них выводит числа от 0 до 100.
/*
Усыпление потоков используется, чтобы увидеть одновременную работу потоков
Этой же задаче служат разные числа вывода
 */

/*
Способы создания потоков - 1) унаследоваться от класса Thread и переопределить метод Run
2) реализовать интерфейс Runnable
 Второй лучше, так как множественное наследование не разрешено.
 А если мы унаследуемся, то других родителей добавить не сможем,
 а интерфейсов мы можем реализовывать сколько угодно
 */

public class TenThreads {
    public static void main(String[] args) {
        //нужен объект интерфейсного типа Runnable, который передается в параметры экземпляру потока
        //но нам он нужен один раз, поэтому используем
        // экземпляр потока с использованием анонимного класса,
        // чтобы не создавать отдельнвй класс и его экземпляр (он нам нужен один раз)
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 101; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 101; i < 201; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 201; i < 301; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread3.start();

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 301; i < 401; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread4.start();

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 401; i < 501; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread5.start();

        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 501; i < 601; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread6.start();

        Thread thread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 601; i < 701; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread7.start();

        Thread thread8 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 701; i < 801; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread8.start();

        Thread thread9 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 801; i < 901; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread9.start();

        Thread thread10 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 901; i < 1001; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread10.start();
    }
}