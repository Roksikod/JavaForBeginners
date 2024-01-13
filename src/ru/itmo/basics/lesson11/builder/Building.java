package ru.itmo.basics.lesson11.builder;

public class Building {
    private Builder builder;
    private Builder builder2;

    public Building() {
        builder = new FirstHouse();
    }

    public Building(String s) {
        builder2 = new SecondHouse();
    }

    public House buildHouse(){
        return builder.buildHouse();
    }

    public House buildHouse2(){
        return builder2.buildHouse();
    }

    public static void main(String[] args) {
        House house = new Building().buildHouse();

        System.out.println("=====================");

        House house2 = new Building("str").buildHouse2();
    }

}
