package ru.itmo.basics.lesson6.examples;

public class Bus extends Transport {

    public Bus(Integer weight, Integer seatPlace, Boolean isFlying) {
        super(weight, seatPlace, isFlying);
    }

    @Override
    public void printTransportInfo() {
        System.out.println(transportName());
    }

    @Override
    public String transportName() {
        return "Scania";
    }

    @Override
    public void abstractMethod() {

    }
}