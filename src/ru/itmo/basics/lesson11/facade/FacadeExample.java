package ru.itmo.basics.lesson11.facade;

public class FacadeExample {
    public static void main(String[] args) {
//        Power power = new Power();
//        power.on();
//
//        FlashDrive flashDrive = new FlashDrive();
////        flashDrive.load();
//        flashDrive.unload();
//
//        SSD ssd = new SSD();
//        ssd.copyFromFlash(flashDrive);

        Computer computer = new Computer();
        computer.copy();
    }
}

class Power {
    void on() {
        System.out.println("Power on!");
    }

    void off() {
        System.out.println("Power off!");
    }
}

class FlashDrive {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    void load() {
        data = true;
    }

    void unload() {
        data = false;
    }
}

class SSD {
    void copyFromFlash(FlashDrive flash) {
        if (flash.hasData()) {
            System.out.println("Data is copying...");
        } else {
            System.out.println("Please, insert a flash.");
        }
    }
}

/*Facade*/
class Computer {
    Power power = new Power();
    FlashDrive flash = new FlashDrive();
    SSD ssd = new SSD();

    void copy() {
        power.on();
        flash.load();
        ssd.copyFromFlash(flash);
    }
}