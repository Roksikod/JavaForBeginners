package ru.itmo.basics.lesson6;
import java.io.Serializable;

public interface Moveable extends Interface, Serializable {

    public static final String NAME = "Brand";

    public abstract void printTransportInfo();

    public abstract String transportName();

    public default void someMethod() {
        System.out.println("someMethod");
    }

    public static void staticMethod() {
        //logic
    }

    private static void privateMethod() { // в Java 8 нет такого модификатора
        //logic
    }
}