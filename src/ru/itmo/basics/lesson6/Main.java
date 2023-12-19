package ru.itmo.basics.lesson6;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        Field[] declaredFields = car.getClass().getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }

//        Object object = new Object();

        Parent parent = new Parent();
        Parent child = new Child();
        Parent anotherChild = new AnotherChild();

//        parent.print();
//        child.print();
//        anotherChild.print();

//        Child someChild = new Parent(); создание невозможно!

//        Child someChild = new Child();
//
////        ((Parent)someChild).print();
//        ((Child)parent).print(); // ClassCastException

//        getSomebody(parent);
//        getSomebody(child);
//        getSomebody(anotherChild);

//        Moveable car = new Car();
//        Moveable bus = new Bus();
//
//        printMoveableName(car);
//        printMoveableName(bus);

        Transport volvo = new Car(2000, 5, false);
        Transport scania = new Bus(20000, 55, false);
        Transport superJet = new Plane(20000, 155, true);


        printMoveableName(volvo);
        printMoveableName(scania);
        printMoveableName(superJet);

    }

//
//    public static void someMethod(Object o) {
//        if (o instanceof Child) {
//            System.out.println("true");
//        }
//    }


    public static void getSomebody(Parent somebody) {
        somebody.print();
    }

    public static void printMoveableName(Moveable moveable) {
        moveable.printTransportInfo();
    }

    public static void printMoveableName(Transport transport) {
        transport.printTransportInfo();
    }
}

