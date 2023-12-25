package ru.itmo.basics.lesson6;

public class Plane extends Transport {


    public Plane(Integer weight, Integer seatPlace, Boolean isFlying) {
        super(weight, seatPlace, isFlying);
    }

    @Override
    public void abstractMethod() {

    }

    @Override
    public void printTransportInfo() {
        System.out.println(transportName());
    }

    @Override
    public String transportName() {
        return "SuperJet";
    }
}