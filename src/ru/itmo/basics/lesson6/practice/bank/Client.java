package ru.itmo.basics.lesson6.practice.bank;

public class Client extends Person implements PersonInfo {
    private String bankName;
    private int visits;
    private int operation;

    public Client(String name, String lastName, String bankName) {
        super(name, lastName);
        this.bankName = bankName;
    }

    @Override
    public void getInfo() {
        System.out.println("Название банка: " + this.bankName);
        System.out.println("Клиент банка: " + this.getName() + " " + this.getLastName());
    }

    @Override
    public void getOperations() {
        if (isEmptyListVisits(visits)) {
            System.out.println("Клиент в банк не приходил");
        } else {
            System.out.println("Клиент совершил " + operation + " операций");
        }
    }

    private boolean isEmptyListVisits(int visits) {
        return visits == 0;
    }

    @Override
    public void addOperations() {
        for (int i = 0; i < visits; i++) {
            operation++;
        }
    }
}
