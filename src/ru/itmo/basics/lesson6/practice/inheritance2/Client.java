package ru.itmo.basics.lesson6.practice.inheritance2;

public class Client extends User {
    @Override
    public String getName() {
        super.getName();
        return name;
    }

    @Override
    public void setName() {
        super.setName();
    }

    @Override
    public String getUserInfo() {
        super.getUserInfo();
        System.out.println("Имя пользователя? ");
        name = scanner.next();
        return "Имя пользователя: " + name;
    }

    public static void main(String[] args) {
        Client client = new Client();
        System.out.println(client.getUserInfo());
    }
}
