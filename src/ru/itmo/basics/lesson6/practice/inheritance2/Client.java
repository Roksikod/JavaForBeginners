package ru.itmo.basics.lesson6.practice.inheritance2;

public class Client extends User {
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getUserInfo(String name, int age) {
        super.getUserInfo(name, age);
        return "Имя пользователя: " + name;
    }

    public static void main(String[] args) {
        Client client = new Client();
        System.out.println(client.getUserInfo("Василий", 100));
    }
}
