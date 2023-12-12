package ru.itmo.basics.lesson3.practice3;

public class Car {
    public String color;  //цвет
    public int weigth;  //вес
    public String brand; //название

    //конструктор без параметров
    public Car() {
    }

    //конструктор с один параметром - цвет
    public Car(String color) {
        this.color = color;
    }

    //конструктор с параметрами цвет и вес
    public Car(String color, int weigth) {
        this.color = color;
        this.weigth = weigth;
    }

    //сеттер для цвета
    public void setColor(String color) {
        this.color = color;
    }

    //сеттер для веса
    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    //сеттер для названия
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //метод для выведения на печать
    public void printData() {
        System.out.println("Цвет машины: " + this.color + "\n"
                + "Бренд машины: " + this.brand + "\n"
                + "Вес машины: " + this.weigth);
    }

    //создаем объекты после точки входа в программу и выводим для них данные на печать
    public static void main(String[] args) {
        Car carForGirl = new Car();
        carForGirl.brand = "Volvo";
        carForGirl.weigth = 1000;
        carForGirl.color = "white";

        Car carForMan = new Car("black", 1500);
        carForMan.brand = "BMW";

        System.out.println("Мы выбрали машину для девочки");
        carForGirl.printData();
        System.out.println();
        System.out.println("Мы выбрали машину для парня");
        carForMan.printData();
    }
}
