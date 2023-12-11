package ru.itmo.basics.lesson2.practice2;

public class Box {
    double length;
    double width;
    double height;

    public Box() {
        this.length = 10;
        this.width = 10;
        this.height = 10;
        //this(10); так можно вызвать конструктор из конструктора, чтобы не дублировать код
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
        this.length = size;
        this.width = size;
        this.height = size;
        //this(size, size, size); так можно вызвать конструктор из конструктора, чтобы не дублировать код
    }

    double getVolume() {
        return length * width * height;
    }
    void showVolume(){
        System.out.println(getVolume());
    }

}
