package ru.itmo.basics.lesson3.practice3;

import java.time.LocalDate;

public class House {
    public int floor;  //количество этажей
    public int year;  //год постройки
    public String name;  //наименование

    //метод для установки значений для полей
    public void setValues(int floor, int year, String name) {
        this.floor = floor;
        this.year = year;
        this.name = name;
    }

    //метод для вывода всех значений
    public void printData() {
        System.out.println("Наименование здания: " + this.name + "\n"
                + "Год постройки: " + this.year + "\n"
                + "Количество этажей: " + this.floor);
    }

    //метод, возвращающий количество лет с момента постройки
    public int yearsOld() {
        return LocalDate.now().getYear() - this.year;
    }
    //На основе класса создайте два объекта и пропишите для каждого характеристики.
    // Добавление характеристик реализуйте через метод класса.

    public static void main(String[] args) {  //точка входа
        House house1 = new House();
        house1.setValues(5, 1946, "Отчий дом");

        House house2 = new House();
        house2.setValues(9, 1975, "Девятиэтажка");

        House house3 = new House();
        house3.setValues(2, 1989, "Гараж");

        //Выведите информацию про каждый объект.
        house1.printData();
        System.out.println("Этому зданию уже " + house1.yearsOld() + " лет.");
        System.out.println();
        house2.printData();
        System.out.println("Этому зданию уже " + house2.yearsOld() + " лет.");
        System.out.println();
        house3.printData();
        System.out.println("Этому зданию уже " + house3.yearsOld() + " лет.");
    }
}
