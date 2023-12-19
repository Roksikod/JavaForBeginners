package ru.itmo.basics.lesson2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "X3");

        car.setColor(Color.BLACK);

//        String brand = car.getBrand();
//
//        System.out.println(car);
//        System.out.println(brand);


//        car.setPrice(5000000L);

//
//        long totalPrice = CarService.totalPrice(car, null);
//
//
//        System.out.println(totalPrice);

//
//        System.out.println(car.getColor());
//        System.out.println(car.getColor().getDescription());

        someMethod("null");

    }


    public static void someMethod(String word) {
        String localString;
        int localInt;

        if (word == null) {
            localInt = 0;
        } else {
            localInt = word.length();
        }


        System.out.println(localInt);
    }


}

