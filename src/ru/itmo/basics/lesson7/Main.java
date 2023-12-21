package ru.itmo.basics.lesson7;

import ru.itmo.basics.lesson6.examples.Transport;

public class Main {
    public static void main(String[] args) {
//        OuterClass.InnerClass innerClass = new OuterClass.InnerClass(); создание невозможно
//        OuterClass.NestedStaticClass nestedStaticClass = new OuterClass.NestedStaticClass();
//        nestedStaticClass.nestedStaticClassMethod();

        SomeInterface someObject = new SomeInterface() {
            @Override
            public void print() {
                System.out.println(name());
            }

            @Override
            public String name() {
                return "John";
            }
        };

        someObject.print();

        Transport transport = new Transport(10000, 50, false) {
            @Override
            public void abstractMethod() {

            }

            @Override
            public void printTransportInfo() {

            }

            @Override
            public String transportName() {
                return null;
            }
        };

        transport.transportName();

    }

    public void someMethod() {
//        OuterClass.InnerClass innerClass = new OuterClass.InnerClass(); создание невозможно
    }

}
