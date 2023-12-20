package ru.itmo.basics.lesson6.practice.bank;

import ru.itmo.basics.lesson6.practice.bank.Person;
import ru.itmo.basics.lesson6.practice.bank.PersonInfo;

public class Employee extends Person implements PersonInfo {
    private String bankName;
    private String today;
    int countOperations = 0;

    public Employee(String name, String lastName, String bankName) {
        super(name, lastName);
        this.bankName = bankName;
    }

    @Override
    public void getInfo() {
        System.out.println("Название банка: " + this.bankName);
        System.out.println("Сотрудник банка: " + this.getName() + " " + this.getLastName());
    }

    @Override
    public void getOperations() {
        if (isEmptyDay(today)) {
            System.out.println("Сегодня у сотрудника выходной");
        } else {
            System.out.println("За сегодня проведено " + countOperations);
        }
    }

    @Override
    public void addOperations() {
        int worktime = 8;
        for (int i = 0; i < worktime; i++) {
            countOperations++;
        }
        System.out.println("За сегодняшний день сотрудник провел " + countOperations + " операций");
    }

    private boolean isEmptyDay(String day) {
        return day == "Суббота" || day == "Воскресенье" || day == "Праздник/отпуск";
    }
}
