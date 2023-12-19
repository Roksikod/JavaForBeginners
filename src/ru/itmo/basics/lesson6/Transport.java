package ru.itmo.basics.lesson6;

import java.io.Serializable;

public abstract class Transport implements Moveable, Interface, Serializable {

    private Integer weight;
    private Integer seatPlace;
    private Boolean isFlying;

    public Transport(Integer weight, Integer seatPlace, Boolean isFlying) {
        this.weight = weight;
        this.seatPlace = seatPlace;
        this.isFlying = isFlying;
    }

    public abstract void abstractMethod();

    public void info() {
        //logic
    }
}

