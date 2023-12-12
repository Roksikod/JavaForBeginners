package ru.itmo.basics.lesson3.practice3;

public class Tree {
    public String name;
    public boolean isAlive;
    public int age;

    //Конструктор, который устанавливает только возраст и название
    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Конструктор, который устанавливает все переменные в классе
    public Tree(String name, boolean isAlive, int age) {
        this.name = name;
        this.isAlive = isAlive;
        this.age = age;
    }

    //Конструктор, который ничего не устанавливает, но выводит сообщение «Пустой конструктор без параметров сработал».
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    //Создаем три объекта на основе класса и используем по одному конструктору на каждый.
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree("NewYear Tree", 120);
        Tree tree3 = new Tree("", true, 200);
    }
}
