package ru.itmo.basics.lesson2;

public class CarService {
    public static long totalPrice(Car car, Integer servicePrice) {

        if (car.getPrice() == null) {
            return 0;
        }

        if (servicePrice == null) {
            return car.getPrice();
        }

        return servicePrice + car.getPrice();
    }

}
