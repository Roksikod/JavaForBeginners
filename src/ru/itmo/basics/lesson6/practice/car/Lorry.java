package ru.itmo.basics.lesson6.practice.car;

public class Lorry extends Car{
    private int wheels;
    private int maxWeigth;

    public Lorry(int w, String m, char c, float s, int wheels, int maxWeigth) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeigth = maxWeigth;
    }

    public Lorry(int wheels, int maxWeigth) {
        this.wheels = wheels;
        this.maxWeigth = maxWeigth;
    }

    private void setNewWheels(int newWheels){
        this.wheels = newWheels;
        System.out.println("Теперь у грузовика " + wheels + " колес.");
    }
}
