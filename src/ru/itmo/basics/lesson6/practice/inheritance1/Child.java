package ru.itmo.basics.lesson6.practice.inheritance1;

public class Child extends Parent {
    @Override
    public int getNumber() {
        return super.getNumber();
    }

    @Override
    public void setNumber(int a) {
        super.setNumber(a);
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.getNumberFromParentClass());
    }

    private int getNumberFromParentClass(){
        return getNumber();
    }
}
