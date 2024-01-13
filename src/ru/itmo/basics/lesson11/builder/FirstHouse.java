package ru.itmo.basics.lesson11.builder;

public class FirstHouse extends Builder{
    public FirstHouse() {
        super.house = new House();
    }

    @Override
    public House buildHouse() {
        house.buildBase();
        house.buildWalls();
        house.buildFloors();
        house.buildRoof();
        return house;
    }
}
